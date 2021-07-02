/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suabt_atm;

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
    public void rutTien(int sotien) {
        int soTo = 0;
        soTo = sotien/menhGia;
        int tienDu = sotien % menhGia;
        if(soTo>0)
            System.out.println("So tien " + menhGia + " co " + soTo + " to");
        if(tienDu > 0 && menhGiaTT != null)
            menhGiaTT.rutTien(tienDu);
    }

    @Override
    public ATM thietLapMenhGia(ATM atm) {
        menhGiaTT = atm;
        return atm;
    }

}
