/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2_PLKH;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        IPhanLoai phanLoai = PhanLoai.getPhanLoai();
        int diem;
        System.out.println("Nhap điem đe kiem tra: ");
        Scanner sc = new Scanner(System.in);
         //print thay vì println, nó sẽ in ra, nhưng không xuống dòng

        diem = sc.nextInt();
        
        System.out.println("Phan loai KH: " + phanLoai.phanloai(diem));
    }
}
