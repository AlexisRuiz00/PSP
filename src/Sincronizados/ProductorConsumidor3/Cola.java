package Sincronizados.ProductorConsumidor3;

public class Cola {
    private int num;
    private int turnoP;
    private int turnoC;
    private boolean flag = false;

    public Cola(){
        this.turnoC = 1;
        this.turnoP = 1;
    }

    public synchronized void put(int x, int n){
        while(flag || (n!= turnoP)){
            try{
                wait();
            }catch (Exception e){e.printStackTrace();}
        }


        num = x;
        System.out.println("Produce p"+n+":"+ num);
        flag = true;
        notifyAll();
    }

    public synchronized void get(int i, int n) {
        while(!flag || (n!=turnoC)){
            try{
                wait();
            }catch (Exception e){e.printStackTrace();}
        }


        if(turnoP == Productor.creados){turnoP=1;}
        else{ turnoP++; }

        if(turnoC == Consumidor.creados){turnoC=1;}
        else{turnoC++;}
        num = 0;
        System.out.println("Consume C"+n+":" +i);

        flag = false;
        notifyAll();
    }



}
