package com.company;

public class Liste {

    String marke;
    int barcode;
    double preis;
    double pfand;


    double berechnungPreis(){
        return preis + pfand;
    }

    void druckeInfo(){
        System.out.printf(marke, preis, pfand);
    }





}
