package Oppgave1;

public class Main{

    public static void main(String[] args) throws InterruptedException {

        Traad traad = new Traad();
        Dialog dialog = new Dialog(traad);

        new Thread(dialog).start();
        new Thread(traad).start();
    }
}