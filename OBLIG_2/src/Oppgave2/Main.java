package Oppgave2;

public class Main {

    public static void main(String[] args) {

        final String[] kokker = {"Erik", "Yuji", "Tati"};
        final String[] servitorer = {"Zizu", "Roger"};
        final int KAPASITET = 4;

        skrivUtHeader(kokker, servitorer, KAPASITET);

        Brett brett = new Brett(KAPASITET);

        for (String navn : kokker) {
            new Kokk(brett, navn).start();
        }

        for (String navn : servitorer) {
            new Servitor(brett, navn).start();
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