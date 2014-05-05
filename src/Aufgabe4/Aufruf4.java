package Aufgabe4;


import Aufgabe4.Auto.color;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Aufruf4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto vw = new Auto ((short)4, color.black, (short)80, (short)5, (short)2);
        Auto mini = new Auto ((short)4, color.blue, (short)70, (short)5, (short)4);
        Auto audi = new Auto ((short)4, color.red, (short)100, (short)5, (short)4);
        Auto bmw = new Auto ((short)4, color.silver, (short)90, (short)5 , (short)5);
        Auto mopedauto = new Auto ((short)4, color.white, (short)30, (short)3, (short)2);
        
        List<Auto> autos = new ArrayList<>();
        autos.add(vw);
        autos.add(mini);
        autos.add(audi);
        autos.add(bmw);
        autos.add(mopedauto);
        
        Collections.sort(autos);
        for(Auto x:autos){
            System.out.println(x.toString());
        }
    }
}
