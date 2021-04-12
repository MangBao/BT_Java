/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3_factory_method_singleton;

/**
 *
 * @author ASUS
 */
public class Circle extends Shape {

    public static Circle circleInstance;

    protected Circle() {
    }

    public static Circle getInstance() {
        if (circleInstance == null) {
            circleInstance = new Circle();
        }
        return circleInstance;
    }

    @Override
    public void draw() {
        System.out.println("Hinh tron");
    }

}
