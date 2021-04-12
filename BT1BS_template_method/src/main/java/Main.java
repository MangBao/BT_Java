/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa item1 = new HangHoa("Tao", 1, 50000);
        HangHoa item2 = new HangHoa("Cam", 5, 100000);
        HangHoa item3 = new HangHoa("Nho", 10, 20000);

        GioHang ttOnl = new ThanhToanOnline();
        ttOnl.gioHang.add(item1);
        ttOnl.gioHang.add(item2);
        ttOnl.gioHang.add(item3);
        System.out.println("Khach hang thanh toan Online");
        ttOnl.hienthiThongtin();
        System.out.println("\n\n");
        GioHang ttCOD = new ThanhToanCOD();
        ttCOD.gioHang.add(item1);
        ttCOD.gioHang.add(item2);
        ttCOD.gioHang.add(item3);
        System.out.println("Khach hang thanh toan COD");
        ttCOD.hienthiThongtin();
    }

}
