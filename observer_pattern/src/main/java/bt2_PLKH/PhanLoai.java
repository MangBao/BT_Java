/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2_PLKH;

/**
 *
 * @author ASUS
 */
public class PhanLoai {
    public static IPhanLoai getPhanLoai() {
        IPhanLoai thanhVien = new ThanhVien();
        IPhanLoai thanThiet = new ThanThiet();
        IPhanLoai bac = new Bac();
        IPhanLoai vang = new Vang();
        IPhanLoai kimCuong = new KimCuong();
        
        thanhVien.setSuccessor(thanThiet).setSuccessor(bac).setSuccessor(vang).setSuccessor(kimCuong);
        return thanhVien;
    }
}
