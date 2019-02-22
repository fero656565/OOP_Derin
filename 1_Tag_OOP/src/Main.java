public class Main {

    public static void main(String[] args) {
//erstellung von objekten

        Auto AudiA4 = new Auto();
        Auto BMW3er = new Auto();
        Auto AudiA6 = new Auto();


        AudiA4.marke = "Audi";
        AudiA4.modell = "A4";
        AudiA4.farbe = "blau";
        AudiA4.serienNummer = "B33xxxxx";
        AudiA4.Verbrauch = 8.2;
        AudiA4.Tankvolumen = 60;

        BMW3er.marke = "BMW";
        BMW3er.modell = "3er";
        BMW3er.farbe = "schwarz";
        BMW3er.serienNummer = "B12xxxxx";
        BMW3er.Verbrauch = 7.9;
        BMW3er.Tankvolumen = 63;

        AudiA6.marke = "Audi";
        AudiA6.modell = "A6";
        AudiA6.farbe = "rot";
        AudiA6.serienNummer = "B98xxxxx";
        AudiA6.Verbrauch = 9.6;
        AudiA6.Tankvolumen = 89;

        /*System.out.println("In meiner Garage steht:");
        System.out.printf("... ein " + AudiA4.farbe + "er " + AudiA4.marke + " " + AudiA4.modell + " mit der Seriennr.: " + AudiA4.serienNummer +
                " sein Tankvolumen beträgt: " + AudiA4.Tankvolumen + " ,sein Verbrauch beträgt: " + AudiA4.Verbrauch + "l " + " und eine Reichweite von: "
        + "%.0f\n", AudiA4.berechneReichweite());
        System.out.printf("... ein " + BMW3er.farbe + "er " + BMW3er.marke + " " + BMW3er.modell + " mit der Seriennr.: " + BMW3er.serienNummer +
                " sein Tankvolumen beträgt: " + BMW3er.Tankvolumen + " ,sein Verbrauch beträgt: " + BMW3er.Verbrauch + "l " + " und eine Reichweite von: "
                + "%.0f\n", BMW3er.berechneReichweite());
        System.out.printf("... ein " + AudiA6.farbe + "er " + AudiA6.marke + " " + AudiA6.modell + " mit der Seriennr.: " + AudiA6.serienNummer +
                " sein Tankvolumen beträgt: " + AudiA6.Tankvolumen + " ,sein Verbrauch beträgt: " + AudiA6.Verbrauch + "l " + " und eine Reichweite von: "
                + "%.0f\n", AudiA6.berechneReichweite());*/

        AudiA4.druckeInfo();
        BMW3er.druckeInfo();
        AudiA6.druckeInfo();




    }
}
