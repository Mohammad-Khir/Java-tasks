package oblig1;

import java.text.DecimalFormat;
/*
 class Sirkel {
     static double beregnDiameter(double radius) {
         double diameter = 2 * radius;
         return diameter;
     }

     static double beregnOmkrets(double radius) {
         double omkrets = 2 * Math.PI * radius;
         return omkrets;
     }

     static double beregnAreal(double radius) {
         double areal = Math.PI * Math.pow(radius, 2);
         return areal;
     }
 }*/

 public class Oblig1Oppgav1 {
     public static void main(String[] args) {
         double radius = 10.5;

         double diameter = Sirkel.beregnDiameter(radius);
         double omkrets = Sirkel.beregnOmkrets(radius);
         double areal = Sirkel.beregnAreal(radius);
         DecimalFormat df2 = new DecimalFormat(".##");
         System.out.println("Gitt radius lik " + radius +
                    "\n Arealet av sirkelen med radius " + radius + " er " + df2.format(areal)
                    + "\n Omkretsen av sirkelen med radius " + radius + " er " + df2.format(omkrets)
                    + "\n Diameteren til sirkelen er med radius " + radius + " er " + diameter);


        }
    }
