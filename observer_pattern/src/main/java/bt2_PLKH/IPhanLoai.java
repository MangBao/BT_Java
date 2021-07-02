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
public interface IPhanLoai {
    String phanloai(float diem);

    IPhanLoai setSuccessor(IPhanLoai phanLoai);
}
