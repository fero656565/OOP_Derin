public class Auto {

    String marke;
    String modell;
    String farbe;
    String serienNummer;
    double Tankvolumen;
    double Verbrauch;
    double Reichweite;


    double berechneReichweite(){
        return Tankvolumen / Verbrauch * 100;
    }


    void druckeInfo(){
        System.out.print("In meiner Garage steht: ");
        System.out.printf("1 " + this.farbe + "er " + this.marke + " " + this.modell + " mit der Seriennr.: " + this.serienNummer +
                ", sein Tankvolumen beträgt: " + this.Tankvolumen + ", sein Verbrauch beträgt: " + this.Verbrauch + "l " + " und eine Reichweite beträgt: "
                + "%.0f\n" + " km", this.berechneReichweite());
    }


}
