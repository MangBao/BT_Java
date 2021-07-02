/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_atm_chainofresponsibility;

/**
 *
 * @author ASUS
 */
public interface ATM {
    //mỗi atm có nhìu mệnh giá tiền
    void rutTien(int soTien);
    //rút tiền còn dư thì gọi mệnh giá tiếp
    ATM thietLapMenhGia(ATM atm);
}
