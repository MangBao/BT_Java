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
public class MatHang {
    String tenMH;
    int soLuong, donGia;

    public MatHang(String tenMH, int soLuong, int donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Mat hang:" + "\n + Ten mat hang: " + tenMH + ", So luong: " + soLuong + ", Don gia: " + donGia + "\n";
    }
    
}
