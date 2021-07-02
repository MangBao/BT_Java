/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_atm_chainofresponsibility;

/**
 *
 * @author ASUS
 */
public class RutTien implements ATM {

    int menhGia;
    ATM menhGiaTT;

    public RutTien(int menhGia) {
        this.menhGia = menhGia;
    }

    @Override
    public void rutTien(int soTien) {
        
        int soTo = soTien / menhGia;
        int tienDu = soTien % 5;

        if (soTo > 0) {
            System.out.println("So to co menh gia " + menhGia + ": " + soTo + " to");
        }
        if (tienDu > 0 && menhGiaTT != null) {
            menhGiaTT.rutTien(tienDu);
        }
    }

    @Override
    public ATM thietLapMenhGia(ATM atm) {
        menhGiaTT = atm;
        return atm;
    }

}
