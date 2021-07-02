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
public class Triangle extends Shape {

    public static Triangle triangleInstance;

    protected Triangle() {
    }

    public static Triangle getInstance() {
        if (triangleInstance == null) {
            triangleInstance = new Triangle();
        }
        return triangleInstance;
    }
    
    @Override
    public void draw() {
        System.out.println("Hinh tam giac");
    }

}
