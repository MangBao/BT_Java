/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sua_BT1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class HoaDon {

    HoaDonHeader hoaDonHeader;
    List<CTHD> cthds;

    @Override
    public String toString() {
        return "HoaDon{" + "hoaDonHeader=" + hoaDonHeader + ", cthds=" + cthds + '}';
    }
    
    

    protected HoaDon(Builder builder) {
        hoaDonHeader = builder.hoaDonHeader;
        cthds = builder.cthds;
    }

    public static class Builder {

        HoaDonHeader hoaDonHeader;
        List<CTHD> cthds = new ArrayList<>();

        public void printInfo() {
            cthds.forEach((i) -> {
                System.out.println(i.toString());
            });
            System.out.println(hoaDonHeader.toString());
        }

        public Builder() {
        }

        public Builder addHoaDonHeader(int id, String date, String tenKH) {
            hoaDonHeader = new HoaDonHeader(id, date, tenKH);
            return this;
        }

        public Builder addCTHD(String tenMH, int sl, int dg) {
            cthds.add(new CTHD(tenMH, sl, dg));
            return this;
        }
        
        public HoaDon build(){
            return new HoaDon(this);
        }
    }
}
