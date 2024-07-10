package oblig1;

import javax.swing.*;

public class Oblig1Oppgave2 {
    public static void main (String [] args){

        String innNavn1 = JOptionPane.showInputDialog("skriv inn navn på vare1");
        String innantall1 = JOptionPane.showInputDialog("skriv inn antall på vare1");
        String  innpris1 = JOptionPane.showInputDialog("skriv inn pris på vare1");
        String innNavn2 = JOptionPane.showInputDialog("skriv inn navn på vare2");
        String innantall2 = JOptionPane.showInputDialog("skriv inn antall på vare2");
        String  innpris2 = JOptionPane.showInputDialog("skriv inn pris på vare2");

        int antall1, antall2;
        double pris1,pris2;

        try{
            antall1 = Integer.parseInt(innantall1);
            antall2 = Integer.parseInt(innantall2);
            pris1 = Double.parseDouble(innpris1);
            pris2 = Double.parseDouble(innpris2);
        }
        catch(Exception e){
            antall1=0;
            antall2=0;
            pris1=0;
            pris2=0;
            System.out.println("FEIL SKREVET!");
        }

        Vare vare1=new Vare(innNavn1,antall1,pris1);
        Vare vare2=new Vare(innNavn2, antall2, pris2);



        double totalpris=vare1.totalPris()+vare2.totalPris();
        System.out.println("totallpris til alle varene blir "+ totalpris+" kr");


    }
}
