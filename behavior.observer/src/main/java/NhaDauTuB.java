/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class NhaDauTuB implements TiGia.TiGiaObserver {

    TiGia dvTiGia;
    float tiGia;

    public void dangKy() {
        this.dvTiGia.dangKy(this);
        this.tiGia = dvTiGia.tiGia;
    }

    public void huyDangKy() {
        this.dvTiGia.huyDangKy(this);
    }

    public void setTiGia(TiGia tiGia) {
        this.dvTiGia = tiGia;
    }

    @Override
    public void capNhat(float tiGiaMoi) {
        if (tiGiaMoi > tiGia) {
            System.out.println("Nha Dau Tu B: Ban vao");
        } else {
            System.out.println("Nha Dau Tu A: Mua vao");
        }
        this.tiGia = tiGiaMoi;
    }
}
