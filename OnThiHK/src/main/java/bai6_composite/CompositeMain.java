/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class CompositeMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Abstract khoa = new QLMonHoc("Khoa hoc");
        Abstract nam = new QLMonHoc("Nam hoc 2020");
        Abstract ky1 = new QLMonHoc("Hoc ki 1");
        Abstract ky2 = new QLMonHoc("Hoc ki 2");
        
        MonHoc Toan = new MonHoc("Toan",2,200);
        MonHoc THCS = new MonHoc("Tin hoc co so",3,200);
        MonHoc MTK = new MonHoc("Mau thiet ke",3,300);
        MonHoc CNNP = new MonHoc("Cong nghe phan mem",2,150);
        MonHoc LY = new MonHoc("Vat ly",4,330);
        MonHoc HOA = new MonHoc("Hoa hoc",3,210);
        
        khoa.add(nam);
        nam.add(ky1);
        nam.add(ky2);
        
        ky1.add(Toan);
        ky1.add(THCS);
        ky1.add(MTK);
        
        ky2.add(LY);
        ky2.add(HOA);
        ky2.add(CNNP);
        
        System.out.println("Quan ly mon hoc:");
        System.out.println(khoa.getStringTree());

        
        System.out.println("Tong tin chi theo "+ky1.ten +": " + ky1.TongTC());
        System.out.println("Tong hoc phi theo "+ky1.ten +": " + ky1.TongHP());
        
        System.out.println("Tong tin chi theo "+nam.ten +": " + nam.TongTC());
        System.out.println("Tong hoc phi theo "+nam.ten +": " + nam.TongHP());
    }
    
}
