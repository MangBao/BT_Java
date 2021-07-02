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
public class Stream {
    List<Observer> list = new ArrayList<>();    
    List<Object> dsChuoi = new ArrayList<>();

    public Stream() {
    }
    
    public void dangKy(Observer observer) {
        if (!list.contains(observer)) {
            list.add(observer);
        }
    }

    public void huyDangKy(Observer observer) {
        if (list.contains(observer)) {
            list.remove(observer);
        }
    }
    
    public void capNhatMoi(List<Object> dsChuoi){
        
        for(Observer o : list)
            o.capNhat(this.dsChuoi);
    }
    public static interface Observer{
        void capNhat(List<Object> list);
    }
}
