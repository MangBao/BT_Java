/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class ThanhToanCOD extends GioHang {

    @Override
    public double tinhChietKhau() {
        if (tinhTien() > 1000000) {
            return tinhTien() * 0.05;
        } else {
            return 0;
        }
    }

}
