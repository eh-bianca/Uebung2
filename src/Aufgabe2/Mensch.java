package Aufgabe2;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Mensch extends Saeugetier {

    public Mensch(String Name, int Alter, char Geschlecht) {
        super(Name, Alter, Geschlecht);
    }
    
    @Override
    public String printAll() {
        
        return getName()+"#"+ getAlter() +"#"+ getGeschlecht();
        
    }
    
    
    
}
