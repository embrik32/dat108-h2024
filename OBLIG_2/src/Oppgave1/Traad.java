package Oppgave1;

public class Traad implements Runnable{

    private boolean forsett = true;
    private String melding = "Hei verden!";

    @Override
    public void run() {
        while(forsett) {
            System.out.println(melding);

            synchronized (this) {
                try {
                    Thread.sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(melding.equals("quit")){
                    avslutt();
                }
            }
        }
    }

    public synchronized void avslutt(){

        forsett = false;
        notify();
    }

    public String getMelding() {
        return melding;
    }

    public void setMelding(String melding) {
        this.melding = melding;
    }
}