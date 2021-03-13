/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public abstract class Context {

    Tinh tinhToan;

    public void setTinhToan(Tinh tinhToan) {
        this.tinhToan = tinhToan;
    }

    public abstract float tinh();

}
