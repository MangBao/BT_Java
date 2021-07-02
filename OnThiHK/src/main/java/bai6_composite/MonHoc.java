/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_composite;

/**
 *
 * @author ASUS
 */
public class MonHoc extends Abstract {

     int soTC, hocPhi;
    
    public MonHoc(String ten, int soTC, int hocPhi) {
        super(ten);
        this.soTC = soTC;
        this.hocPhi = hocPhi;
    }

    @Override
    public void add(Abstract abs) {
    }
    @Override
    public void remove(Abstract abs) {
    }
    
    @Override
    public String getStringTree() {
        //trả về ký tự thục dòng + tên file
        return this.preStr + ten;
    }
    
    @Override
    public int TongTC() {
        return soTC;
    }

    @Override
    public int TongHP() {
        return soTC * hocPhi;
        
    }


}
