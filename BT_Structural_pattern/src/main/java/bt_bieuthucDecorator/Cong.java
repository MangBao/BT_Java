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
public class Cong extends BieuThucDecorator {

    float toanHang;

    public Cong(float toanHang, BieuThuc bieuThuc) {
        super(bieuThuc);
        this.toanHang = toanHang;
    }

    @Override
    public String bieuThuc() {
        return super.bieuThuc() + "+" +toanHang;
    }

    @Override
    public float giaTri() {
        return bieuThuc.giaTri() + toanHang; //To change body of generated methods, choose Tools | Templates.
    }

}
