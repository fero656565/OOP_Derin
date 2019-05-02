package Buero.Angestellten.Führungskraefte;


import Buero.Angestellten.Führungskraft;

public class Abteilungsleiter extends Führungskraft {



    public Abteilungsleiter(String name, int sollZeit) {
        super(name, sollZeit);
    }


    public void mitarbeiterBefoerdern(){
        System.out.println("Mitarbeiter wurde befördert!");
    }




}
