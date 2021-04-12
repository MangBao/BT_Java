
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class QLSV {
    Comparator<SinhVien> sosanh3;

    public void setSosanh3(Comparator<SinhVien> sosanh3) {
        this.sosanh3 = sosanh3;
    }
    private IsoSanh<SinhVien> soSanh;
    ArrayList<SinhVien> list = new ArrayList<>();

    public void setSoSanh(IsoSanh<SinhVien> soSanh) {
        this.soSanh = soSanh;
    }

    public QLSV() {
        list.add(new SinhVien("Bao", new Date(100, 1, 10), (float) 7.2));
        list.add(new SinhVien("Hue", new Date(100, 1, 4), (float) 7.7));
        list.add(new SinhVien("Long", new Date(100, 1, 5), (float) 7.8));
        list.add(new SinhVien("Tri", new Date(100, 1, 7), (float) 7.3));
        list.add(new SinhVien("Tien", new Date(100, 1, 2), (float) 8.0));

    }

    public void sapXep() {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (soSanh.soSanh(list.get(i), list.get(j)) == 1) { //Đỏi chỗ 2 phần tử
//                    SinhVien t = list.get(i);
//                    list.set(i, list.get(j));
//                    list.set(j, t);
                    Collections.swap(list, i, j);
                }
            }
        }
    }

    public void sapxep2() {
        list.sort(new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien o1, SinhVien o2) {
                return soSanh.soSanh(o1, o2);
            }

        });
    }
    public void sapxep3() {
        list.sort(sosanh3);
    }
    
    public void inDS() {
        SimpleDateFormat ft = new SimpleDateFormat("dd/MM/YYYY");
        list.forEach((sv) -> {
            System.out.println(sv.hoTen + " " + ft.format(sv.ngaySinh) + " " + sv.diemTB);
        });
    }
}
