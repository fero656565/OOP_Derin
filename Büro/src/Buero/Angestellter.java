package Buero;




public abstract class Angestellter {

    private String name;
    private int sollZeit;


    public Angestellter(String name, int sollZeit) {
        this.name = name;
        this.sollZeit = sollZeit;
    }

    public void komme() {
        System.out.println(this.name + " ist zur Arbeit gekommen!");
    }

    public void gehe() {
        System.out.println(this.name + " ist nach Hause gegangen!");
    }


}
