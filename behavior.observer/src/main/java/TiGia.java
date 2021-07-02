/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class TiGia {

    List<TiGiaObserver> listenrs = new ArrayList<>();
    float tiGia;

    public TiGia(float tiGia) {
        this.tiGia = tiGia;
    }
    
    public void dangKy(TiGiaObserver observer) {
        if (!listenrs.contains(observer)) {
            listenrs.add(observer);
        }
    }

    public void huyDangKy(TiGiaObserver observer) {
        if (listenrs.contains(observer)) {
            listenrs.remove(observer);
        }
    }

    public void capnhatTiGia(float tiGiaMoi) {
        this.tiGia = tiGiaMoi;
        for (TiGiaObserver o : listenrs) {
            o.capNhat(tiGiaMoi);
        }
    }

    public static interface TiGiaObserver {

        void capNhat(float tiGiaMoi);
    }
}
