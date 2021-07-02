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
public class ShapeFactory {
    public Shape createShape(ShapeType shapeType) {
        if (shapeType == null) {
            return null;
        }

        switch (shapeType) {
            //truy xuất đối tượng hình tròn
            case Circle:
                return new Circle();
    
            case Rectangle:
                return new Rectangle();
                
            case Triagle:
                return new Triangle();
            default:
                break;
        }
        return null;
    }
}
