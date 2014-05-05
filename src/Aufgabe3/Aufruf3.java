package Aufgabe3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Aufruf3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              
        Mensch3 Bernie = new Mensch3("Bernadette","Wieser",19);
        System.out.println(Bernie.Status());
        Bernie = new Student("Bernadette","Wieser",19,1310653399,"Web13");
        System.out.println(Bernie.Status());
    }
}
