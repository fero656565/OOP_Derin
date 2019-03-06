import java.util.ArrayList;
public class Biblothek {

    private int preis;
    private String name;
    private int barCode;
    private int pfand;


    ArrayList<Lebensmittel> LebensmittelListe = new ArrayList<Lebensmittel>();
    ArrayList<KosmetikaUndHaushaltsbedarf> KosmetikaListe = new ArrayList<KosmetikaUndHaushaltsbedarf>();
    ArrayList<Getränke> GetraenkeListe = new ArrayList<Getränke>();
    ArrayList<Getränke> alkoholListe = new ArrayList<Getränke>();
    ArrayList<extras> extrasListe = new ArrayList<extras>();


    private void createLebensmittel(String name, int barCode, double preis){
        LebensmittelListe.add(new Lebensmittel(name, barCode, preis));
    }

    private void createKosmetika (String name, int barCode, double preis){
        KosmetikaListe.add(new KosmetikaUndHaushaltsbedarf(name, barCode, preis));
    }

    private void createGetraenke (String name, int barCode, double preis, double pfand){
        GetraenkeListe.add(new Getränke(name, barCode, preis, pfand));
    }

    private void createAlkohol (String name, int barCode, double preis, double pfand){
        alkoholListe.add(new Getränke(name, barCode, preis, pfand));
    }

    private void createExtras (String name, int barCode, double preis){
        extrasListe.add(new extras(name, barCode, preis));
    }

      public int getPreis(){return preis;}
      public String getName(){return name;}
      public int getBarCode(){return barCode;}
      public int getPfand(){return pfand;}



    public void start(){

        //Lebensmittelliste
        createLebensmittel("Kellogs, Choco 450gr", 10001, 3.29);
        createLebensmittel("Kellogs, Mix 8x 30gr", 10002, 2.99);
        createLebensmittel("Erasco Gulasch 450gr", 10003, 4.29);


        //Getränkeliste
        createGetraenke("Coca Cola 0,33 L", 10004, 0.79, 0.25);
        createGetraenke("Fanta", 10005, 0.79, 0.25);
        createGetraenke("Mineralwasser", 10006, 0.59, 0.15);

        //Alkohol
        createAlkohol("Vodka Moskovskaya 0,5L ", 10007, 6.99, 0);
        createAlkohol("Jack Daniels 0,7L ", 10008, 17.95, 0);
        createAlkohol("Krombacher 0,33L", 10009, 0.69, 0.07);

        //Kosmetika und Haushaltsbedarf
        createKosmetika("Toilettenpapier 8x", 10010, 3.29);
        createKosmetika("Nivea Creme Blau klein", 10011, 1.39);
        createKosmetika("Backpapier", 10012, 1.29);

        //Extras
        createExtras("Tüte klein", 10013, 0.07);
        createExtras("Tüte gross", 10014, 0.10);
        createExtras("Feuerzeug 4x", 10015, 0.99);

    }







}
