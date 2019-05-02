package Buero.Angestellten.ITler;

import Buero.Angestellten.IT;

public class Admin extends IT {

    public Admin(String name, int sollZeit) {
        super(name, sollZeit);
    }


    public void anwenderSchulen() {
        System.out.println(" Sie müssen das Programm so anwenden!");
    }

    @Override
    public void reparieren() {
        System.out.println("Was muss repariert werden?!");
    }

    public void netzwerkEinrichten() {
    }

    public void userAnlegen() {
        System.out.println("Habe den User angelegt!");
    }


}
