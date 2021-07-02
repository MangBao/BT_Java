/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_behavioral.chainofresponsibility;

/**
 *
 * @author ASUS
 */
public class XepLoai {

    public static IXepLoai getXepLoai() {
        IXepLoai yeu = new Yeu();
        IXepLoai tb = new TrungBinh();
        IXepLoai kha = new Kha();
        IXepLoai gioi = new Gioi();
        
        yeu.setSuccessor(tb).setSuccessor(kha).setSuccessor(gioi);
        return yeu;
    }

}
