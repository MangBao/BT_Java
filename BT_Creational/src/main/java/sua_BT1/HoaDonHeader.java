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
public class HoaDonHeader {
    int id;
    String dateString, tenKH;

    public HoaDonHeader(int id, String dateString, String tenKH) {
        this.id = id;
        this.dateString = dateString;
        this.tenKH = tenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader{" + "id=" + id + ", dateString=" + dateString + ", tenKH=" + tenKH + '}';
    }
    
    
}
