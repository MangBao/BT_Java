/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7_stream;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Consumer implements Stream.Observer {

    Stream stream;
    List<Object> chuoi = new ArrayList<>();

    public void setStream(Stream stream) {
        this.stream = stream;
    }    
    
    public void dangKy() {//đk observer
        this.stream.dangKy(this);
        this.chuoi=this.stream.dsChuoi;
    }

    public void huyDangKy() {
        this.stream.huyDangKy(this);
    }

    @Override
    public void capNhat(List<Object> list) {
        System.out.println("Chuoi moi: " + list);
    }

}
