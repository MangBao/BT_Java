/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package suabt_atm;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {
        ATM atm = new RutTien(200);
        ATM menhGia100 = new RutTien(100);
        ATM menhGia50 = new RutTien(50);
        ATM menhGia20 = new RutTien(20);
        ATM menhGia5 = new RutTien(5);
        ATM menhGia1 = new RutTien(1);
        
        atm.thietLapMenhGia(menhGia100)
                .thietLapMenhGia(menhGia50)
                .thietLapMenhGia(menhGia20)
                .thietLapMenhGia(menhGia5)
                .thietLapMenhGia(menhGia1)
                .thietLapMenhGia(null);
        
        
        int gia = 0;
            System.out.println("Nhap so tien: ");
            Scanner input = new Scanner(System.in);
            gia = input.nextInt();
            
        atm.rutTien(547);
    }
}
