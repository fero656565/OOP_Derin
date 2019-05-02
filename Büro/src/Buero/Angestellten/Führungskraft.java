package Buero.Angestellten;

import Buero.Angestellter;

public abstract class Führungskraft extends Angestellter {



    public Führungskraft(String name, int sollZeit){
        super(name, sollZeit);
    }

   public void delegieren(){
       System.out.println("Das machst du!");
   }

}
