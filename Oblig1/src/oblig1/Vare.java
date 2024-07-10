package oblig1;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare (String navn, int antall, double pris){
        this.navn = navn;
        //this.antall = antall;
        //this.pris = pris;
         setPris(pris);
         setAntall(antall);
    }

    public String getNavn(){

        return navn;
    }
    public void setNavn(String navn){
    this.navn = navn;
    }
    public int getAntall(){
       return antall;
    }
    public void setAntall(int antall){
        if ( antall > 0 ){
            this.antall = antall;
        }
    }
    public double getPris(){

        return pris;
    }
    public void setPris(double pris){
        if ( pris > 0 ){
            this.pris = pris;
        }
    }

    public double totalPris(){
        double totalPris = getPris()*getAntall();
        return totalPris;
    }
}
