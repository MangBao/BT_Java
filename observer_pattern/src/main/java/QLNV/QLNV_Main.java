/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLNV;

/**
 *
 * @author ASUS
 */
public class QLNV_Main {
    public static void main(String[] args) {
        NguoiQuanLy nql = new NguoiQuanLy("Thiet ke web", "Mo ta cong viec TKW", "27/1/2021");
        new NhanVien("Bao", nql);
        
        nql.giaoViecMoi("Thiet ke CSDL", "Mo ta cong viec TK CSDL", "28/1/2021");
    }
}
