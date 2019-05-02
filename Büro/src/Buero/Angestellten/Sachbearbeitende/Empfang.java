package Buero.Angestellten.Sachbearbeitende;

import Buero.Angestellten.Sachbearbeiter;

public class Empfang extends Sachbearbeiter {

    public Empfang(String name, int sollZeit) {
        super(name, sollZeit);
    }

    public void begruessen() {
        System.out.println("Herzlich Willkommen!");
    }

    public void telefonieren() {
        System.out.println("Nummer wird gewählt...");
    }

    @Override
    public void datenEintragen() {
        System.out.println("Teilnehmer in Liste eintragen!");
    }


}
