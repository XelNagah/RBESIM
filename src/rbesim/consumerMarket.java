/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rbesim;

/**
 *
 * @author zerg
 */
public class consumerMarket {
    private String name;
    private int ammount;

    public consumerMarket() {
    }
        
    public consumerMarket(String name, int ammount) {
        this.name = name;
        this.ammount = ammount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public String getName() {
        return name;
    }

    public int getAmmount() {
        return ammount;
    }
}
