/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_atm_chainofresponsibility;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ATM atm = new RutTien(500);
        ATM menhGia100 = new RutTien(100);
        ATM menhGia50 = new RutTien(50);
        ATM menhGia10 = new RutTien(10);
        ATM menhGia1 = new RutTien(1);

        // nối chuỗi
        atm.thietLapMenhGia(menhGia100)
                .thietLapMenhGia(menhGia50)
                .thietLapMenhGia(menhGia10)
                .thietLapMenhGia(menhGia1)
                .thietLapMenhGia(null);
        
//        Scanner input = new Scanner(System.in);
//        System.out.print("Nhập số tiền: ");
//        int soTien = input.nextInt();
        while (true) {            
            int amount =0;
            System.out.println("Nhap so tien: ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount <= 0) {
                throw new InputMismatchException(amount + " be hon 0");
            }
            atm.rutTien(amount);
        }        
    }
    
}
