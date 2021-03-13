/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ThanhToanOnline implements IThanhtoan {

    @Override
    public double thanhtoan(int tienHang) {
        if (tienHang < 1000000) {
            return tienHang * 0.05;
        } else {
            return tienHang * 0.07;
        }
    }

}
