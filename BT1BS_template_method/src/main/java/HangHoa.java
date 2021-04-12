/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class HangHoa {

    String tenHH;
    int soLuong;
    int gia;

    public HangHoa(String tenHH, int soLuong, int gia) {
        this.tenHH = tenHH;
        this.soLuong = soLuong;
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Ten: " + tenHH + ", So luong: " + soLuong + ", Gia: " + gia + ", Thanh tien: " + soLuong * gia + '}';
    }

}
