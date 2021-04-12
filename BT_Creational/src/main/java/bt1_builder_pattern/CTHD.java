/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1_builder_pattern;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ASUS
 */
public class CTHD {
    String tenSP;
    int soLuong;
    float donGia, chietKhau;


    public CTHD(String tenSP, int soLuong, float donGia, float chietKhau) {
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
        this.chietKhau = chietKhau;
    }

    @Override
    public String toString() {
        return "Ten SP: " + tenSP + ", So luong: " + soLuong + ", Don gia: " + donGia;
    }
    
    
}
