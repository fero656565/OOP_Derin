

public class KosmetikaUndHaushaltsbedarf {




    private String name;
    private int barCode;
    private double preis;



    public KosmetikaUndHaushaltsbedarf(String Name, int barCode, double preis) {
        this.name = Name;
        this.barCode = barCode;
        this.preis = preis;
    }

    public String getName(){
        return name;
    }

    public int getBarCode(){
        return barCode;
    }

    public double getPreis(){return preis;}




}
