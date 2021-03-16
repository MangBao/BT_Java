/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author HP
 */
public class QLSV {
    ISoSanh soSanh;
    List<SinhVien> listSV = new ArrayList<>();
    
    public void sapXep() {
        for(int i = 0; i < listSV.size() - 1; i++) {
            for(int j = i + 1; j < listSV.size(); j++) {
                if(soSanh.soSanh(listSV.get(i), listSV.get(j)) == 1) {
                    SinhVien temp;
                    temp = listSV.get(i);
                    listSV.set(i, listSV.get(j));
                    listSV.set(j, temp);
                }
            }
        }      
    }
    
    public void inDS() {
        SimpleDateFormat ft = new SimpleDateFormat ("dd/MM/yyyy");
        listSV.forEach((sv) -> {
            System.out.println(sv.hoTen + "   " + ft.format(sv.ngaySinh) + "   " + sv.diemTB);
        });
    }

    public void setSoSanh(ISoSanh soSanh) {
        this.soSanh = soSanh;
    }
}
