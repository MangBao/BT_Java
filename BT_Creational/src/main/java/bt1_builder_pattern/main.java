/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1_builder_pattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        
        List<CTHD> hh = new ArrayList();
        
        hh.add(new CTHD("Tao", 10, 50000, (float) 0.3));
        hh.add(new CTHD("Cam", 9, 60000, (float) 0.3));
        hh.add(new CTHD("Quyt", 8, 40000, (float) 0.3));
        hh.add(new CTHD("Vai", 10, 30000, (float) 0.3));
        
        Hoadon.Builder buidler = new Hoadon.Builder();
        Hoadon hd = buidler.addmaHD("H01").addtenKH("Mang Bao").addngayBan(new Date(05 - 04 - 2021)).build();
        
        System.out.println("Khach hang mua: ");
        System.out.println(hd.toString());
        System.out.println("Thong tin san pham: ");
        hh.forEach((item) -> {
            System.out.println(item.toString());
//            System.out.println(item.tenSP + "\t" + item.soLuong + "\t" + item.donGia + "\t" + item.chietKhau); 
        });

    }
}
