/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sua_BT1;


/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        HoaDon.Builder builder = new HoaDon.Builder();
        builder.addCTHD("Tao", 3, 40000).addHoaDonHeader(1, "20/2/2021", "Mang Bao").build();
        builder.printInfo();
    }
}
