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
        List<consumerMarket> markets = new ArrayList<>();
        List<producerFactory> producers = new ArrayList<>();
        List<rawMaterial> materials = new ArrayList<>();
        
        materials.add(new rawMaterial("Metal",1));
        materials.add(new rawMaterial("Wood",1300));
        materials.add(new rawMaterial("Cows",60));
        
        producers.add(new producerFactory("Factory1",1));
        producers.add(new producerFactory("Factory2",1));
        producers.add(new producerFactory("Factory3",1));
        
        markets.add(new consumerMarket("Metal Doors",4000));
        markets.add(new consumerMarket("Wood Doors",4000));
        markets.add(new consumerMarket("Meat",4000));
        
        System.out.println("Materials pool:\n");
        Iterator itr = materials.iterator();
        rawMaterial material;
        while (itr.hasNext()){
            material = (rawMaterial) itr.next();
            System.out.println("Name: " + material.getName() + " - " + "Ammount: " + material.getAmmount());
        }
        
        System.out.println("Factories pool:\n");
        itr = producers.iterator();
        producerFactory producer;
        while (itr.hasNext()){
            producer = (producerFactory) itr.next();
            System.out.println("Name: " + producer.getName() + " - " + "Ammount: " + producer.getAmmount());
        }
        
        System.out.println("Markets pool:\n");
        itr = markets.iterator();
        consumerMarket market;
        while (itr.hasNext()){
            market = (consumerMarket) itr.next();
            System.out.println("Name: " + market.getName() + " - " + "Ammount: " + market.getAmmount());
        }
    }
    
}
