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
public class AirPay implements IHinhthucTT {

    @Override
    public double hinhThucTT(int tienHang) {
        return (tienHang >= 1000000) ? tienHang * 0.03 : 0;
    }

}
