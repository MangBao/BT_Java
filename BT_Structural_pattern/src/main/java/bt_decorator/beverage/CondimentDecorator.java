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
public abstract class CondimentDecorator extends Beverage {

    Beverage beverage;


    public CondimentDecorator(Beverage beverage, String desciption) {
        super(desciption);
        this.beverage = beverage;
    }

    @Override
    public String getDesciption() {
        return beverage.getDesciption() + ", " + desciption; //To change body of generated methods, choose Tools | Templates.
    }

}
