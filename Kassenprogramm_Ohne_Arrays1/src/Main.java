import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        String marke;
        int barCode;
        double preis;
        double pfand;
        int eingabe;
        int produktKlasse;

        //klasse 1: Lebensmittel, Klasse 2: Getränke, Klasse 3: Haushaltsartikel, Klasse 4: alkoholische Getränke
        // Klasse 5: Extras


        System.out.println("Willkommen bei der Kasse V1.0");
        System.out.println("Menü: ");
        System.out.println(" ");
        System.out.println("1 Kasse starten");
        System.out.println("2 neues Produkt speichern");
        System.out.println("3 Quittungen ansehen");
        System.out.println("4 zum herunterfahren des Systems");
        System.out.println(" ");
        System.out.print("Auswahl:   ");
        eingabe = sc.nextInt();





    }
}
