/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class main {

    public static void main(String[] args) {
        Cong cong = new Cong();
        Tru tru = new Tru();
        Nhan nhan = new Nhan();
        Chia chia = new Chia();

        System.out.println("Tong: " + cong.tinh(1, 2));
        System.out.println("Hieu: " + tru.tinh(4, 2));
        System.out.println("Tich: " + nhan.tinh(5, 5));
        System.out.println("Thuong: " + chia.tinh(10, 2));
    }
}
