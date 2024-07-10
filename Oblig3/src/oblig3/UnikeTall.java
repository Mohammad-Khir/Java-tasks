package oblig3;

import javax.swing.*;


public class UnikeTall {
    private int[] liste;


    public UnikeTall(int lengde) {
        liste = new int[lengde];
    }

    private boolean sjekkeTall(int tall) {
        for (int vardi : liste) {
            if (vardi == tall) {
                return true;
            }
        }
        return false;
    }


    private void fylleArray() {
        for (int i = 0; i < liste.length; i++) {
            int tilfeldigTall = (int) (Math.random() * (900) + 100);
            if (sjekkeTall(tilfeldigTall)!=true){
                liste[i]=tilfeldigTall;
            }else{
                i--;
            }
        }
    }


    private int minsteTall(){
        int minste = liste[0];
        for (int vardi : liste){
            if(vardi<minste){
                minste = vardi;
            }
        }
        return minste;
    }

    private int størsteTall(){
    int største = liste[0];
    for (int vardi : liste){
        if(vardi>største){
            største = vardi;
        }
    }
    return største;
    }

   private double gjennomsnitt(){
        int sum=0;
        for (int i=0;i< liste.length;i++){
            sum+=liste[i];
        }
        double snitt = (double) sum/ liste.length;
        return snitt;
   }

   public void visTall() {
       fylleArray();
       String ut="";

       for (int i = 1; i <= liste.length; i++) {
           ut += liste[i-1]+" ";
           if (i%9 == 0){
               ut += "\n";
           }
       }

       JOptionPane.showMessageDialog(null,ut+"\n \n"
                +"Minste tall er : "+minsteTall()+"\n"
                +"Største tall er : "+størsteTall()+"\n"
                +"Gjennomsnittet er : "+String.format("%.2f",gjennomsnitt()));

     }

}