/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sua_BT1;

/**
 *
 * @author ASUS
 */
public class CTHD {

    String tenSP;
    int soLuong, donGia;

    public CTHD(String tenSP, int soLuong, int donGia) {
        this.tenSP = tenSP;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "CTHD{" + "tenSP=" + tenSP + ", soLuong=" + soLuong + ", donGia=" + donGia + '}';
    }
    
    
}
