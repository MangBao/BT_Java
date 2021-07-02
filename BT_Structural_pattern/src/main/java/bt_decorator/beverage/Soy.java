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
public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage, String desciption) {
        super(beverage, desciption);
    }


    @Override
    public int cost() {
        return beverage.cost() + 2;
    }

}
