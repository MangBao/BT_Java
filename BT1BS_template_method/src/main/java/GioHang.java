/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Asus
 */
public abstract class GioHang {

    List<HangHoa> gioHang = new ArrayList<>();

    public double tinhTien() {
        int tienHang = 0;
        for (HangHoa hh : gioHang) {
            tienHang += hh.gia * hh.soLuong;
        }
        return tienHang;
    }

    public abstract double tinhChietKhau();

    public void hienthiThongtin() {
        System.out.println("Gio hang gom co:");
        gioHang.forEach((hh) -> {
            System.out.println(hh.toString());
        });
        System.out.println("Tong tien hang (chua tinh chiet khau): " + tinhTien()
                + "\nTien chiet khau: " + tinhChietKhau()
                + "\nTien khach hang can thanh toan: " + (tinhTien() - tinhChietKhau()));
    }
}
