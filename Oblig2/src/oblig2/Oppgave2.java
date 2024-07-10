package oblig2;

import static javax.swing.JOptionPane.*;

class Tallspill {
    public int nyttTall() {
        return  (int) (Math.random() * 201);

    }

    public void visMelding(String melding) {
        showMessageDialog(null, melding);
    }

    private void forLite(int tall) {
        showMessageDialog(null, tall + " er for lite! prøv igjen!");
    }

    private void forStort(int tall) {
        showMessageDialog(null, tall + " er for stort! prøv igjen!");
    }

    public void avsluttRunde(int antall, int gjetning) {
        showMessageDialog(null, gjetning + " er riktig!\n" +
                "Du gjettet riktig på " + antall + " forsøk.");
    }

    public void kjørSpill() {

        int gjetning = nyttTall();
        int antall = 0;
        int tall = 300;  // Her antar jeg en tilfeldig feil tall bare for å gå inn i løkken.

        while (tall != gjetning) {
            try {
                tall = Integer.parseInt(showInputDialog("Jeg tanker på et tall mellom 0 og 200.\n" +
                    "Prøv å gjette på tallet"));


                if (tall > 200 || tall < 0) {
                    visMelding("Feil tall! fordi tallet må være mellom 0 og 200. \n" +
                            "Prøv igjen");
                } else {
                    antall++;
                    if (tall< gjetning) {
                        forLite(tall);
                    }
                    if (tall > gjetning) {
                        forStort(tall);
                    }
                }
            }
            catch (Exception e ){
                visMelding("Prøv kun med tall!\n tallet er mellom 0 og 200.");
            }
        }

            avsluttRunde(antall, gjetning);

    }
}

public class Oppgave2 {
    public static void main(String [] args){
    Tallspill tall = new Tallspill();
    tall.kjørSpill();
    }
}
