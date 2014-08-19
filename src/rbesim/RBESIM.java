/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rbesim;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author zerg
 */
public class RBESIM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola");
        List<consumerMarket> markets = new ArrayList<>();
        List<producerFactory> producers = new ArrayList<>();
        List<rawMaterial> materials = new ArrayList<>();
        
        materials.add(new rawMaterial("Metal",1));
        materials.add(new rawMaterial("Wood",1300));
        materials.add(new rawMaterial("Cows",60));
        Iterator itr = materials.iterator();
        rawMaterial material;
        while (itr.hasNext()){
            material = (rawMaterial) itr.next();
            System.out.println("Name: " + material.getName() + " - " + "Ammount: " + material.getAmmount());
        }
    }
    
}
