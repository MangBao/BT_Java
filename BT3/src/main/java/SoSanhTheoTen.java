/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
public class SoSanhTheoTen implements ISoSanh {

    @Override
    public int soSanh(SinhVien o1, SinhVien o2) {
        if(o1.hoTen.compareTo(o2.hoTen) > 0)
            return 1;
        else if(o1.hoTen.compareTo(o2.hoTen) == 0)
            return 0;
        else
            return -1;
    }
    
}
