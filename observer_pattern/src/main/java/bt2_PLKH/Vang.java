/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2_PLKH;

/**
 *
 * @author ASUS
 */
public class Vang implements IPhanLoai{
    IPhanLoai pl;
    @Override
    public String phanloai(float diem) {
        if (diem >= 2500 && diem < 5000) {
            return "Vang";
        }
        return pl.phanloai(diem);
    }

    @Override
    public IPhanLoai setSuccessor(IPhanLoai phanLoai) {
        this.pl = phanLoai;
        return phanLoai;
    }
}
