/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_strategy_pattern;

/**
 *
 * @author ASUS
 */
public class KhuyenMai5PhanTram implements IKhuyenMai {

    @Override
    public double tienKhuyenMai(int tienHang) {
        double khuyenMai = 0.1 * tienHang;
        return (khuyenMai > 50000) ? 50000 : khuyenMai;
    }
}
