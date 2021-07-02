/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4HoaDon;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class DsHangHoa {

    List<HangHoa> dsHangHoa = new ArrayList<>();

    public double tinhTien() {
        int tienHang = 0;
        for (HangHoa hh : dsHangHoa) {
            tienHang += hh.donGia * hh.soLuong;
        }
        return tienHang;
    }

    public abstract double tinhChietKhau();

    public void hienthiThongtin() {
        dsHangHoa.forEach((t) -> {
            System.out.println(t.toString());
        });
        System.out.println("Tong tien hang (chua tinh chiet khau): " + tinhTien()
                + "\nTien chiet khau: " + tinhChietKhau()
                + "\nTien khach hang can thanh toan: " + (tinhTien() - tinhChietKhau()));
    }
}
