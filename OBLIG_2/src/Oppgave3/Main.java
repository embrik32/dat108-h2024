package Oppgave3;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {

    public static void main(String[] args) {

        final String[] kokker = {"Erik", "Yuji", "Tati"};
        final String[] servitorer = {"Zizu", "Roger"};
        final int KAPASITET = 4;

        BlockingQueue<Hamburger> blockingQueue = new LinkedBlockingQueue<Hamburger>(KAPASITET);

        skrivUtHeader(kokker, servitorer, KAPASITET);

        for (String navn : kokker) {
            new Kokk(blockingQueue, navn).start();
        }

        for (String navn : servitorer) {
            new Servitor(blockingQueue, navn).start();
        }
    }

    public static void skrivUtHeader(String[] kokker, String[] servitorer, int KAPASITET){

        System.out.println("I denne simuleringen har vi");

        System.out.print("3 kokker [");
        for (String k : kokker) {
            System.out.print(k + ", ");
        }
        System.out.println("]");

        System.out.print("2 servitorer [");
        for (String s : servitorer) {
            System.out.print(s + ", ");
        }
        System.out.println("]");

        System.out.println("Kapasiteten til brettet er " + KAPASITET + " hamburgere.");

        System.out.println("Vi starter..." + "\n");
    }
}