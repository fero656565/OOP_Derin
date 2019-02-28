import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        int eingabeAuswahl;
        Scanner sc = new Scanner(System.in);

        System.out.println("Welchen Körper möchten Sie zeichnen?");
        System.out.println("Wählen Sie bitte eines der aufgeführten Möglichkeiten aus und" + Colors.YELLOW + " geben dafür die dazugehörige Zahl ein und bestätigen dies mit der Enter-Eingabe" + Colors.RESET + ".");
        System.out.println(Colors.YELLOW + "1 " + Colors.RESET + "ausgefülltes Rechteck");
        System.out.println(Colors.YELLOW + "2 " + Colors.RESET + "unausgefülltes Rechteck");
        System.out.println(Colors.YELLOW + "3 " + Colors.RESET + "linkes Dreieck");
        System.out.println(Colors.YELLOW + "4 " + Colors.RESET + "rechtes Dreieck");
        System.out.println(Colors.YELLOW + "5 " + Colors.RESET + "mittiges Dreieck");
        System.out.print("Auswahl: ");


        //Ein neues Objekt erzeugen
        Rectangle rect1 = new Rectangle();
        Triangle triangle1 = new Triangle();


       eingabeAuswahl = sc.nextInt();


        switch (eingabeAuswahl) {
            case 1:
                rect1.readAttributes();
                rect1.printRectangle();
                break;
            case 2:
                rect1.readAttributes();
                rect1.printNonFilled();
                break;
            case 3:
                triangle1.readAttributes();
                triangle1.printTriangleLeft();
                break;
            case 4:
                triangle1.readAttributes();
                triangle1.printTriangleRight();
                break;
            case 5:
                triangle1.readAttributes();
                triangle1.printTriangleMiddle();
                break;
        }
    }
}

/*
        //Attribute setzen - setter verwenden

        rect1.readAttributes();


        //Rechteck ziehen - Methoden ausführen


        rect1.printRectangle();
        rect1.printNonFilled();

        triangle1.readAttributes();


        triangle1.printTriangleLeft();
        triangle1.printTriangleRight();
        triangle1.printTriangleMiddle();

    }
}
*/