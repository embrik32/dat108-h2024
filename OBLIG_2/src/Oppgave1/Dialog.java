package Oppgave1;

import javax.swing.JOptionPane;

public class Dialog implements Runnable{

    private Traad traad;

    public Dialog(Traad traad){
        this.traad = traad;
    }


    @Override
    public void run() {

        String input = traad.getMelding();

        while(!input.equals("quit")){

            input = JOptionPane.showInputDialog("");
            traad.setMelding(input);
        }
    }
}