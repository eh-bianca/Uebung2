package Aufgabe4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author User
 */
public class Auto extends Fahrzeug implements Comparable <Auto> {
    
    private boolean klimaanlage;
    private short airbags;
    private color farbe;
    
    public enum color{
        silver, red, black, blue, white
    }

    public Auto(short reifen, color farbe, short ps, short tueren, short airbags) {
        super(reifen, farbe.toString(), ps, tueren);
        this.klimaanlage = false;
        this.airbags = airbags;
    }   
    
    public Auto (short reifen, short ps, short tueren, short airbags) {
        super(reifen, color.black.toString() ,ps, tueren);
        this.klimaanlage = false;
        this.airbags = airbags;
    }
        
    public void klimaanlageAn() {
        if (klimaanlage) {
            System.out.println("Klimaanlage läuft bereits");
        }
        else {
            klimaanlage = true;
        }
     }
    public void klimaanlageAus() {
        if(klimaanlage) {
            klimaanlage = false;
        }
        else {
            System.out.println("Klimaanlage ist bereits aus");
        }
    }

    public boolean isKlimaanlage() {
        return klimaanlage;
    }

    public void setKlimaanlage(boolean klimaanlage) {
        this.klimaanlage = klimaanlage;
    }

    public short getAirbags() {
        return airbags;
    }

    public void setAirbags(short airbags) {
        this.airbags = airbags;
    }
    
    @Override
    public String toString() {
        return "Mein Auto hat "+ this.getPs() + " PS und fährt mit "+ this.getGeschwindigkeit() + " km/h";
    }
 
    @Override
    public int compareTo(Auto a) {
        
        if(this.getPs() < a.getPs()) {
            return 1;
        }
        else if(this.getPs()>a.getPs()) {
            return -1;
        }
        else {
            return 0;
        }
    }
    
}
