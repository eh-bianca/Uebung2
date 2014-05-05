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
public class Fahrzeug {
    
    private short reifen;
    private String farbe;
    short ps;
    private short tueren;
    private boolean gestartet;
    short geschwindigkeit;
    public static int anzahl;

    public Fahrzeug(short reifen, String farbe, short ps, short tueren) {
        this.reifen = reifen;
        this.farbe = farbe;
        this.ps = ps;
        this.tueren = tueren;
        this.gestartet = false;
        this.geschwindigkeit = 0;
        this.anzahl++;
    }
  
    public void starten() {
        gestartet = true;
    }
    public void stoppen() {
        gestartet = false;
    }
    public void beschleunigen(short gs) {
        if (gestartet && geschwindigkeit + gs < 250) {
            geschwindigkeit += gs; 
        }
        else if (gestartet && geschwindigkeit + gs > 250) {
            geschwindigkeit = 250;
        }
        else {
            System.err.println("Fahrzeug muss gestartet sein");
        } 
    }
    public void bremsen (short gs) {
        if (gestartet && geschwindigkeit - gs > 0) {
            geschwindigkeit -= gs; 
        }
        else if (gestartet && geschwindigkeit - gs < 0) {
            geschwindigkeit = 0;
        }
        else {
            System.out.println("Fahrzeug muss gestartet sein");
        } 
     }

    public short getReifen() {
        return reifen;
    }

    public void setReifen(short reifen) {
        this.reifen = reifen;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public short getPs() {
        return ps;
    }

    public void setPs(short ps) {
        this.ps = ps;
    }

    public short getTueren() {
        return tueren;
    }

    public void setTueren(short tueren) {
        this.tueren = tueren;
    }

    public boolean isGestartet() {
        return gestartet;
    }

    public void setGestartet(boolean gestartet) {
        this.gestartet = gestartet;
    }

    public short getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(short geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public static int getAnzahl() {
        return anzahl;
    }

    public static void setAnzahl(int anzahl) {
        Fahrzeug.anzahl = anzahl;
    }
    
}
