import java.util.Scanner;

public class extras {

    Scanner sc = new Scanner;


    private String name;
    private int barCode;
    private double preis;


    public extras(String name, int barCode, double preis) {
        this.name = name;
        this.barCode = barCode;
        this.preis = preis;
    }

    public String getName(){
        return name;
    }

    public int getBarCode(){
        return barCode;
    }

    public double preis(){
        return preis;
    }




}
