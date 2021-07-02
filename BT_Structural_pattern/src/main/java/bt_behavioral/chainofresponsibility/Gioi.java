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
public class Gioi implements IXepLoai{

    @Override
    public String xeploai(float diem) {
        if(diem <= 10) return "Gioi";
        return "Sieu nhan";
    }

    @Override
    public IXepLoai setSuccessor(IXepLoai xepLoai) {
        return null;
    }
}
