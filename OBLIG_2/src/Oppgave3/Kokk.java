package Oppgave3;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Kokk extends Thread{

    private String navn;
    private final BlockingQueue<Hamburger> blockingQueue;
    private Random random = new Random();

    public Kokk(BlockingQueue<Hamburger> blockingQueue, String navn){

        this.blockingQueue = blockingQueue;
        this.navn = navn;
    }

    public void run() {

        Thread.currentThread().setName(navn);
        while(true){

            try {

                Thread.sleep(random.nextInt(4000) + 2000);
                Hamburger hamburger = new Hamburger();

                if(blockingQueue.remainingCapacity() == 0){
                    System.out.println(Thread.currentThread().getName() + " klar med hamburger, men brett er fullt. Venter!");
                }

                blockingQueue.put(hamburger);
                System.out.println(Thread.currentThread().getName() + " legger på hamburger [" + hamburger + "]. " + "Brett: [" + blockingQueue + " ] \n");

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