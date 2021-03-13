/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class hinhThucTT {

    ThanhToanOnline TTOnline;
    ThanhToanCOD TTCOD;
    
    public IThanhtoan hinhthuctt(int loaiTT){
        /*
        1. Thanh toan online.
        2. Thanh toan COD.
        */
        if (loaiTT == 1) {
            return TTOnline;
        } else if( loaiTT == 2){
            return TTCOD;
        }
        return null;
    }
}
