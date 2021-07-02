/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_decorator.beverage;

/**
 *
 * @author ASUS
 */
public abstract class Beverage {
    String desciption;
    public Beverage(String desciption) {
        this.desciption = desciption;
    }
    
    public abstract int cost();

    public String getDesciption() {
        return desciption;
    }
    
}
