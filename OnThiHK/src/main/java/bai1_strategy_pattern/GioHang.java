/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_strategy_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class GioHang {

    IHinhthucTT httt;
    IDonViVanChuyen dvvc;
    IKhuyenMai km;

    List<MatHang> dsMathang = new ArrayList<MatHang>();

    public int TinhTien() {
        int tienHang = 0;
        for (MatHang matHang : dsMathang) {
            tienHang += matHang.soLuong * matHang.donGia;
        }
        return tienHang;
    }

    public void ThanhToan() {
        System.out.println(dsMathang.toString());
        System.out.println("Tong tien: " + TinhTien());
        System.out.println("Hinh thuc thanh toan: " + httt.hinhThucTT(TinhTien()));
        System.out.println("Phi van chuyen: " + dvvc.MucPhi());
        System.out.println("Tien duoc khuyen mai: " + km.tienKhuyenMai(TinhTien()));
        System.out.println("Tien khach hang can thanh toan: " + (TinhTien() - httt.hinhThucTT(TinhTien()) + dvvc.MucPhi() - km.tienKhuyenMai(TinhTien())));
        System.out.println("Thoi gian du kien nhan hang: " + dvvc.NgayGiao() + " ngay");
    }

    public void setHttt(IHinhthucTT httt) {
        this.httt = httt;
    }

    public void setDvvc(IDonViVanChuyen dvvc) {
        this.dvvc = dvvc;
    }

//    public void setMh(MatHang mh) {
//        this.mh = mh;
//    }
    public void setKm(IKhuyenMai km) {
        this.km = km;
    }

}
