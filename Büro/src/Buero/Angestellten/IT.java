package Buero.Angestellten;

import Buero.Angestellter;

public abstract class IT extends Angestellter {



    public IT(String name, int sollZeit){
        super(name, sollZeit);
    }


 public abstract void reparieren();


}
