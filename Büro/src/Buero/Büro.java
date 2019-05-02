import java.util.Scanner;

package Buero;

import Buero.Angestellten.Führungskraefte.CEO;
import Buero.Angestellten.ITler.Admin;
import Buero.Angestellten.Sachbearbeitende.Empfang;
import Buero.Angestellten.Sachbearbeitende.Verwaltung;

public class Büro {
    private CEO chef;
    private Admin administrator;
    private Empfang empfangEins;
    private Verwaltung verwaltungEins;


    public Büro() {
        this.chef = new CEO("Thorsten", 40);
        this.administrator = new Admin("Stefan", 30);
        this.empfangEins = new Empfang("Klaus", 25);
        this.verwaltungEins = new Verwaltung("Melanie", 35);
    }

    public void start() {
        empfangEins.komme();
        empfangEins.begruessen();
        chef.mitarbeiterEinstellen();
    }
}
