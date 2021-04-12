/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1_builder_pattern;

import java.util.Date;

/**
 *
 * @author ASUS
 */
public class Hoadon {

    String maHD, tenKH;
    Date ngayBan;

    @Override
    public String toString() {
        return "Ma khach hang: " + maHD + ", Ten khach hang: " + tenKH + ", Ngay ban: " + ngayBan;
    }
    
    protected Hoadon(Builder builder){
        this.maHD = builder.maHD;
        this.tenKH = builder.tenKH;
        this.ngayBan = builder.ngayBan;
    }

    public static class Builder {

        String maHD, tenKH;
        Date ngayBan;

        public Builder() {
        }
        
        public Builder addmaHD(String maHD){
            this.maHD = maHD;
            return this;
        }
        public Builder addtenKH(String tenKH){
            this.tenKH = tenKH;
            return this;
        }
        public Builder addngayBan(Date ngayBan){
            this.ngayBan = ngayBan;
            return this;
        }
        public Hoadon build(){
            return new Hoadon(this);
        }
    }
}
