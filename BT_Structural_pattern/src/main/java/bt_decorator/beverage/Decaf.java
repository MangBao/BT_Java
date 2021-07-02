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
public class Decaf extends Beverage{

    public Decaf(String desciption) {
        super(desciption);
    }

    @Override
    public int cost() {
        return 15;
    }
    
}
