package Buero.Angestellten.Führungskraefte;

public class CEO extends Abteilungsleiter {

    public CEO(String name, int sollZeit) {
        super(name, sollZeit);
    }


    public void mitarbeiterEinstellen() {
        System.out.println("Willkommen im Unternehmen!");
    }

    public void mitarbeiterEntlassen() {
        System.out.println("Sie sind gefeuert");
    }


}
