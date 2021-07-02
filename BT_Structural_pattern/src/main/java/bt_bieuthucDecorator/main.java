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
public class main {

    public static void main(String[] args) {
        BieuThuc bt = new BieuThucDonGian(6);
        bt = new Cong(9, bt);
        bt = new Nhan(8, bt);
        bt = new Cong(5, bt);
        
        System.out.println(bt.bieuThuc() + " = " + bt.giaTri());
        
    }
}
