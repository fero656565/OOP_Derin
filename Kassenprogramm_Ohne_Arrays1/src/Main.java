
import java.util.*;



public class Main<eingabe> {


    Scanner sc= new Scanner(System.in);


    String marke;
    int barCode;
    double preis;
    double pfand;

    int produktKlasse;

    //klasse 1: Lebensmittel, Klasse 2: Getränke, Klasse 3: Haushaltsartikel, Klasse 4: alkoholische Getränke
    // Klasse 5: Extras
    public static void main(String[] args) {

        System.out.println("Willkommen bei der Kasse V1.0");
        System.out.println("Menü: ");
        System.out.println(" ");
        System.out.println("1 Kasse starten");
        System.out.println("2 neues Produkt speichern");
        System.out.println("3 Quittungen ansehen");
        System.out.println("4 zum herunterfahren des Systems");
        System.out.println(" ");
        System.out.print("Auswahl:   ");
        int eingabe = sc.nextInt();


        try {
            java.io.BufferedReader FileReader =                      //ein Reader um die Datei Zeilenweise auszulesen
                    new java.io.BufferedReader(
                            new java.io.FileReader(
                                    new java.io.File("C:\\Users\\CC-Student\\Desktop\\abc\\Mappe1.csv")
                            )
                    );

            String zeile = "";

            while (null != (zeile = FileReader.readLine())) {         //lesen jeder Zeile

            }

        } catch (Exception e) {
            e.printStackTrace();

        }

    }

}




        /*
            public static void main(final String[] args) {

            printZerlegt("Name;Barcode;Pfand;Preis;Kategorie");
            printZerlegt("Name|Vorname|Geburtsdatum|Geburtsort");
            printZerlegt("Name|Vorname;Geburtsdatum;Geburtsort");
        }

        */







