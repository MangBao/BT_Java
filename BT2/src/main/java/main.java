/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class main {

    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa item1 = new HangHoa("Dao", 250000, "Day la Dao");
        HangHoa item2 = new HangHoa("Cam", 300000, "Day la Cam");
        HangHoa item3 = new HangHoa("Nho", 500000, "Day la Nho");

        Giohang gh = new Giohang();
        IThanhtoan ttOnline = new ThanhToanOnline();
        IThanhtoan ttCOD = new ThanhToanCOD();

        gh.gioHang.add(item1);
        gh.gioHang.add(item2);
        gh.gioHang.add(item3);

        System.out.println("Gio hang co: ");
        gh.gioHang.forEach((item) -> {
            System.out.println(item.tenHH + "\t" + item.gia + "\t" + item.moTa);
        });

        gh.setHinhThucTT(ttOnline);
        System.out.println("Thanh toan online: " + gh.thanhtoan());

        gh.setHinhThucTT(ttCOD);
        System.out.println("Thanh toan COD: " + gh.thanhtoan());
    }
}
