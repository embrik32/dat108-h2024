package Oppgave2;

import java.util.Random;

public class Kokk extends Thread{

    private String navn;
    private Brett brett;
    private Random random = new Random();

    public Kokk(Brett brett, String navn){

        this.navn = navn;
        this.brett = brett;
    }

    public void run() {

        Thread.currentThread().setName(navn);
        while(true){

            try {

                Thread.sleep(random.nextInt(4000) + 2000);
                brett.leggTil(new Hamburger());

            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return navn + " (kokk) ";
    }
}