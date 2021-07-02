/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_behavioral.chainofresponsibility;

/**
 *
 * @author ASUS
 */
public class main {

    public static void main(String[] args) {
        
        IXepLoai xepLoai = XepLoai.getXepLoai();

        System.out.println("Diem 6: " + xepLoai.xeploai(6));
    }
}
