package Aufgabe3;


import Aufgabe3.Mensch3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Student extends Mensch3 {
    
    private int MatrNr;
    private String Studiengang;

    public Student(String Vorname, String Nachname, int Alter, int MatrNr, String Studiengang) {
        super(Vorname, Nachname, Alter);
        this.MatrNr = MatrNr;
        this.Studiengang = Studiengang;
    }

    @Override
    public String Status() {
        return "Es handelt es sich um einen Studenten mit dem Namen " + getVorname() + " " + getNachname() + 
                ", Alter: " + getAlter() + ", Matrikelnummer: " + getMatrNr() + ", Studiengang: " + getStudiengang();
    }
    
    public int getMatrNr() {
        return MatrNr;
    }

    public void setMatrNr(int MatrNr) {
        this.MatrNr = MatrNr;
    }

    public String getStudiengang() {
        return Studiengang;
    }

    public void setStudiengang(String Studiengang) {
        this.Studiengang = Studiengang;
    }
    
    
    
    
}
