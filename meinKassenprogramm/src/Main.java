import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        int eingabe;

        Scanner sc = new Scanner(System.in);


        Biblothek biblothek = new Biblothek();


        biblothek.start();

        System.out.println("Geben Sie bitte die Menge(bis 1000x) oder den Barcode ein und bestätigen dann mit Enter");


        eingabe = sc.nextInt();


        if(eingabe <=1000){



        }

            /*
            biblothek.LebensmittelListe() || biblothek.alkoholListe() ||
                    biblothek.extrasListe() || biblothek.GetraenkeListe() ||
                    biblothek.KosmetikaListe()
        }
*/



    }
}
