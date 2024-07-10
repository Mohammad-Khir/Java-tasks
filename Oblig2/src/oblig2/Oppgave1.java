package oblig2;

import static javax.swing.JOptionPane.*;


public class Oppgave1 {
    public static void main(String [] args){
        int fraTall = Integer.parseInt(showInputDialog("Skriv inn fratall:"));
        int tilTall = Integer.parseInt(showInputDialog("Skriv inn tiltall:"));

        while(tilTall <= fraTall){
           showMessageDialog(null,"Ugyldig tall!, skriv inn nye tall");
            fraTall = Integer.parseInt(showInputDialog("Skriv inn fratall:"));
            tilTall = Integer.parseInt(showInputDialog("Skriv inn tiltall:"));
        }
        int sum = 0;
        int teller = 0;
        for(int i=fraTall; i < tilTall; i++){
            sum+=i;
            teller++;
            if( teller%10==1 ){ System.out.println(); }

            System.out.print(i+" + ");
        }

        sum+=tilTall;
        System.out.print(tilTall+" = "+sum);


    }
}
