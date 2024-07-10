package oblig1;

public class Sirkel {
   public static double beregnDiameter(double radius) {
        double diameter = 2 * radius;
        return diameter;
    }

    public static double beregnOmkrets(double radius) {
        double omkrets = 2 * Math.PI * radius;
        return omkrets;
    }

   public static double beregnAreal(double radius) {
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }
}
