package Buero.Angestellten;

import Buero.Angestellter;

public abstract class Sachbearbeiter extends Angestellter {

    public Sachbearbeiter(String name, int sollZeit){
        super(name, sollZeit);
    }


    public abstract void datenEintragen();





}
