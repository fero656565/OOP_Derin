import java.util.Scanner;

public class Getränke {

    Scanner sc = new Scanner;


    private String name;
    private int barCode;
    private double preis;
    private double pfand



    public Getränke(String name, int barCode, double preis, double pfand) {
        this.name = name;
        this.barCode = barCode;
        this.preis = preis;
        this.pfand = pfand;
    }

    public String getName(){
        return name;
    }

    public int getBarCode(){
        return barCode;
    }

    public double getPreis(){
        return preis;
    }

    public double pfand(){
        return pfand;
    }

}
