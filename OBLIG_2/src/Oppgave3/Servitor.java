package Oppgave3;

import java.util.Random;
import java.util.concurrent.BlockingQueue;

public class Servitor extends Thread{

    private String navn;
    private final BlockingQueue<Hamburger> blockingQueue;
    private Random random = new Random();

    public Servitor(BlockingQueue<Hamburger> blockingQueue, String navn){

        this.blockingQueue = blockingQueue;
        this.navn = navn;
    }

    public void run() {

        Thread.currentThread().setName(navn);
        while (true) {
            try {

                Thread.sleep(random.nextInt(4000) + 2000);

                if(blockingQueue.isEmpty()){
                    System.out.println(Thread.currentThread().getName() + " ønsker å ta hamburger, men brettet er tomt. Venter!");
                }

                Hamburger hamburger = blockingQueue.take();
                //blockingQueue.take();
                System.out.print(Thread.currentThread().getName() + " tar av hamburger " + hamburger + ". " + "Brett: [" + blockingQueue + " ] \n");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String toString() {
        return navn + " (servitør) ";
    }
}