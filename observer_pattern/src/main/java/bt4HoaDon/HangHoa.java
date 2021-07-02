/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4HoaDon;
/**
 *
 * @author ASUS
 */
public class HangHoa {

    String tenMH;
    int soLuong;
    int donGia;

    public HangHoa(String tenMH, int soLuong, int donGia) {
        this.tenMH = tenMH;
        this.soLuong = soLuong;
        this.donGia = donGia;
    }

    @Override
    public String toString() {
        return "Ten: " + tenMH + ", So luong: " + soLuong + ", Gia: " + donGia + ", Thanh tien: " + (soLuong * donGia);
    }

}
