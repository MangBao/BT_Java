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
public class Rectangle extends Shape {

    public static Rectangle rectangleInstance;

    protected Rectangle() {
    }

    public static Rectangle getInstance() {
        if (rectangleInstance == null) {
            rectangleInstance = new Rectangle();
        }
        return rectangleInstance;
    }

    @Override
    public void draw() {
        System.out.println("Hinh chu nhat");
    }

}
