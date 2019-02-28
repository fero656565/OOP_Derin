import java.util.Scanner;

public class Triangle {

    Scanner input = new Scanner(System.in);

    private int length;


    public void printTriangleLeft() {

        // Zeilen
        for (int i = 1; i <= length; i++) {
            // Zeichen innerhalb einer Zeile
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public void printTriangleRight() {
        for (int i = 1; i <= length; i++) {
            // 1. Leerzeichen einfügen
            for (int j = length - i; j >= 1; j--) {
                System.out.print("  ");
            }
            // 2. Rauten einfügen
            for (int j = 1; j <= i; j++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public void printTriangleMiddle() {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("# ");
            }
            System.out.println();
        }
    }

    public void setLength(int length){
        this.length = length;
    }

    public void readAttributes(){
        System.out.println("Length of the Triangle: ");
        length = input.nextInt();
    }
}