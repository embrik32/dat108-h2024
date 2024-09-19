package Oppgave2;

public class Hamburger {

    private int id;
    private static int nummer = 1;

    public Hamburger(){
        synchronized (Hamburger.class){
            id = nummer;
            nummer++;
        }
        this.id = nummer++;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "[" + id + "]";
    }
}