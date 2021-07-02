/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_bieuthucDecorator;

/**
 *
 * @author ASUS
 */
public class Nhan extends BieuThucDecorator {

    float toanHang;

    public Nhan(float toanHang, BieuThuc bieuThuc) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        if(super.bieuThuc().contains("+") || super.bieuThuc().contains("-" )){
            return "(" + super.bieuThuc() + ") * " + Float.toString(toanHang);
        }
        return super.bieuThuc() + "*" + Float.toString(toanHang);
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() * toanHang; //To change body of generated methods, choose Tools | Templates.
    }

}
