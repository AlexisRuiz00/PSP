package Sincronizados.ProductorConsumidor3;

public class Cola {
    private int num;
    private int turnoP = 0;
    private int turnoC = 0;
    private boolean flag = true;

    public Cola(){
    }


    public synchronized void put(int x, int n){
        while(!flag && n!= turnoP){
            try{
                wait();
            }catch (Exception e){e.printStackTrace();}
        }
        if(turnoP == Productor.creados){turnoP=1;}
        else{turnoP+=1;}

        flag = false;
        System.out.println("Produce p"+n+":"+ x);
        num = x;
        notifyAll();
    }

    public  synchronized void get(int n, int i) {
        while(flag && n!= turnoC){
            try{
                wait();
            }catch (Exception e){e.printStackTrace();}
        }
        if(turnoC == Consumidor.creados){turnoC=1;}
        else{turnoC+=1;}

        flag = true;
        System.out.println("Consume C"+n+":" +i);
        num = 0;
        notifyAll();
    }



    public int getNum(){
        return num;
    }


}
