public class Fahrzeuge {

    private String hersteller;
    private String modell;
    private int kmStand;
    private int preis;
    private int geschwindigkeit;
    private int maxGeschwindigkeit;




    public void setHersteller(String hersteller){
    this.hersteller = hersteller;}

    public String getHersteller(){
        return this.hersteller; }



    public void setModell(String modell){
        this.modell = modell;}

    public String getModell(){
        return this.modell; }

    public void setKmStand(int kmStand){
        this.kmStand = kmStand;}

    public int getKmStand(){
        return this.kmStand; }


        public void setPreis(int preis){
        this.preis = preis;}

    public int getPreis(){
        return this.preis; }

        //geschwindigkeit und bremsen

        public int getGeschwindigkeit(){
        return geschwindigkeit; }

        public void setMaxGeschwindigkeit(int maxGeschwindigkeit){
        this.maxGeschwindigkeit = maxGeschwindigkeit; }


    public int beschleunigen( int kmh){
        //prüfen ob kmh > 0 und neue Geschwindigkeit <= maximale Geschwindigkeit

        if(kmh > 0 && this.geschwindigkeit + kmh <= maxGeschwindigkeit)
        this.geschwindigkeit = this.geschwindigkeit + kmh;
        return this.geschwindigkeit; }


    public int bremsen(int kmh){
        //neue Geschwindigkeit >= 0 und übergeben kmh > 0
        if(kmh > 0){
            this.geschwindigkeit -= kmh;
            if(this.geschwindigkeit < 0)
                this.geschwindigkeit = 0;
        }
        return this.geschwindigkeit;
    }


}
