/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_ui;

/**
 *
 * @author ASUS
 */
public class SanPham {
    String maSP, tenSP;
    int soLuong;
    float donGia;

    public SanPham(String maSP, String tenSP, int soLuong, float donGia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    public String getMaSP() {
        return maSP;
    }

    @Override
    public String toString() {
        return "Mã sản phẩm: " + maSP 
                +", Tên sản phầm: " + tenSP 
                +", Số lượng: " +soLuong
                +", Đơn giá: " +donGia;
    }
    
}
