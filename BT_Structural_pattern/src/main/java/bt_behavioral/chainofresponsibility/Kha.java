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
public class Kha implements IXepLoai{
    IXepLoai xl;

    @Override
    public String xeploai(float diem) {
        if(diem < 8) return "Kha";
        return xl.xeploai(diem);
    }

    @Override
    public IXepLoai setSuccessor(IXepLoai xepLoai) {
        this.xl = xepLoai;
        return xepLoai;
    }
}
