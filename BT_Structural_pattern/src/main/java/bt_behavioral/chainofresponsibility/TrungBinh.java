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
public class TrungBinh implements IXepLoai{
    IXepLoai xl;

    @Override
    public String xeploai(float diem) {
        if(diem < 7) return "Trung binh";
        return xl.xeploai(diem);
    }

    @Override
    public IXepLoai setSuccessor(IXepLoai xepLoai) {
        this.xl = xepLoai;
        return xepLoai;
    }
}
