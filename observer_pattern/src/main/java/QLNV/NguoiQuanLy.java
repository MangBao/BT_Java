/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLNV;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class NguoiQuanLy{
    List<NguoiQuanLyObserver> listeners = new ArrayList<>();
    String tenCV, motaCV, ngayKT;

    public NguoiQuanLy(String tenCV, String motaCV, String ngayKT) {
        this.tenCV = tenCV;
        this.motaCV = motaCV;
        this.ngayKT = ngayKT;
    }
    
    public void dangKy(NguoiQuanLyObserver observer) {        
        listeners.add(observer);        
    }
    
    
    public void giaoViecMoi(String congviecMoi,String motaMoi,String ngayKTMoi) {
        this.tenCV = congviecMoi;
        this.motaCV = motaMoi;
        this.ngayKT = ngayKTMoi;
        for (NguoiQuanLyObserver nql : listeners) {
            nql.giaoCongViec(congviecMoi, motaMoi, ngayKTMoi);
        }
    }
    
    public static interface NguoiQuanLyObserver {
        void giaoCongViec(String congviecMoi, String motaMoi, String ngayKTMoi);
    }
    
}
