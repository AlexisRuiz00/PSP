package HILOS.Refuerzo.Ej11;

public class Arbitro {

    private int nJugadores;
    private int turno;
    private int numero;
    private boolean fin;

    public Arbitro(int nJugadores, int turno) {
        this.nJugadores = nJugadores;
        this.turno = turno;
        this.numero = 1+(int) (10*Math.random());
        this.fin = false;
    }


    public synchronized void compruebaJugada(int jugador, int jugada) {

        while (turno != jugador) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }

        if (fin) { //doNothing
        } else {


            if (turno == nJugadores) {
                turno = 1;
            } else turno++;

            System.out.println("Jugador " + jugador + " dice: " + jugada);
            if (this.numero == jugada) {
                System.out.println("  Jugador " + jugador + " gana, adivinó el número!!!");
                fin = true;
                notifyAll();
            } else {
                System.out.println("        Le toca a Jugador " + turno);
                notifyAll();
            }
        }
    }


    public int getNumero() {
        return numero;
    }

    public int getTurno() {
        return turno;
    }

    public boolean isFin() {
        return fin;
    }
}
