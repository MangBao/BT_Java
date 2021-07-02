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
public interface IXepLoai {

    String xeploai(float diem);

    IXepLoai setSuccessor(IXepLoai xepLoai);
}
