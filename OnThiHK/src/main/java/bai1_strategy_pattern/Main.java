/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1_strategy_pattern;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        //Thêm mặt hàng
        GioHang gh = new GioHang();
        gh.dsMathang.add(new MatHang("Tao", 10, 50000));
        gh.dsMathang.add(new MatHang("Cam", 20, 50000));
        gh.dsMathang.add(new MatHang("Le", 30, 50000));
        
        //chọn hình thức thanh toán
        gh.setHttt(new COD());
        
        // Chọn đơn vị vận chuyển
        gh.setDvvc(new GiaoHangNhanh());
        
        // Chọn hình thức khuyến mãi
        gh.setKm(new KhuyenMai10PhanTram());
        gh.ThanhToan();
    }
}
