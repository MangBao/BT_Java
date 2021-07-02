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
public class COD implements IHinhthucTT {

    @Override
    public double hinhThucTT(int tienHang) {
        return (tienHang >= 2000000) ? tienHang * 0.02 : 0;
    }

}
