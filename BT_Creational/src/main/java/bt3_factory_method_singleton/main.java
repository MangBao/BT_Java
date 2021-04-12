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
public class main {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        
        //Factory method
        Shape htron1 = shapeFactory.createShape(ShapeType.Circle);
        Shape htron2 = Circle.getInstance();
        Shape htron3 = Circle.getInstance();
        htron3.draw();
        htron2.draw();
        
        //htron1.draw();
        

        Shape hcn = shapeFactory.createShape(ShapeType.Rectangle);
        hcn.draw();

        Shape htg = shapeFactory.createShape(ShapeType.Triagle);
        htg.draw();
    }
}
