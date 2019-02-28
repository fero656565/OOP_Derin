import java.util.Scanner;

public class Rectangle {

    Scanner input = new Scanner(System.in);


    //Attribute
    private int length;
    private int width;
    private int borderWidth;

    //Methoden
    public void printRectangle() {
        // 2. Gefülltes Rechteck
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }

    public void printNonFilled(){
        // Erste Zeile
        for (int i = 1; i <= borderWidth; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        // 2. - vorletzte Zeile
        for (int i = 1; i <= length - borderWidth * 2; i++) {
            // borderWidth Teil 1 - Teil vor der Aussparung
            for (int k = 1; k <= borderWidth; k++) {
                System.out.print("#");
            }
            // Aussparung
            for (int j = 1; j <= width - 2 * borderWidth; j++) {
                System.out.print(" ");
            }
            // Rahemen Teil 2 - Teil nach der Aussparung
            for (int k = 1; k <= borderWidth; k++) {
                System.out.print("#");
            }
            // Zeilenumbruch am Ende der Zeile
            System.out.println();
        }
        // Letzte Zeile
        for (int i = 1; i <= borderWidth; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }




    //Setter
    public void setWidth(int width){
        this.width = width;

    }

    public void setLength(int length){
        this.length = length;
    }

    public void setBoderWidth(int borderWidth){
        this.borderWidth = borderWidth;
    }


    public void readAttributes(){
        System.out.println("Width: ");
        width = input.nextInt();

        System.out.println("Length: ");
        length = input.nextInt();

        System.out.println("Borderwidth: ");
        borderWidth = input.nextInt();
    }

}
