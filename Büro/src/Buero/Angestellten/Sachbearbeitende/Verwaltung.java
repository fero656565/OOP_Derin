package Buero.Angestellten.Sachbearbeitende;

import Buero.Angestellten.Sachbearbeiter;

public class Verwaltung extends Sachbearbeiter {


    public Verwaltung(String name, int sollZeit){
        super(name, sollZeit);
    }


    public void buchHaltung(){}



    @Override
    public void datenEintragen(){
        System.out.println("Neuer Dozent im Register eingetragen!");
    }


    public void personalPlanen(){
        System.out.println("Die Einsatzplätze wurden erstellt!");
    }

    public void buchhaltung(){
        System.out.println("Die neuen Recher sind abgeschrieben!");
    }
}
