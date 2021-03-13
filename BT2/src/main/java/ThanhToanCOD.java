/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class ThanhToanCOD implements IThanhtoan {

    @Override
    public double thanhtoan(int tienHang) {
        if (tienHang > 2000000) {
            return tienHang * 0.02;
        } else {
            return tienHang;
        }
        
    }

}
