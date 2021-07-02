/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class TiGiaMain {
    public static void main(String[] args) {
        TiGia tiGia = new TiGia(20035);
        NhaDauTuA a = new NhaDauTuA();
        NhaDauTuB b = new NhaDauTuB();
        
        a.setTiGia(tiGia);
        b.setTiGia(tiGia);
        a.dangKy();
        b.dangKy();
        
        tiGia.capnhatTiGia(21000);
        tiGia.capnhatTiGia(20500);
        b.huyDangKy();
        tiGia.capnhatTiGia(20600);
    }
}
