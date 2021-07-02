/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_composite;


/**
 *
 * @author ASUS
 */
public abstract class Abstract {

    String ten;
    String preStr = "";

    public Abstract(String ten) {
        this.ten = ten;
    }

    abstract public void add(Abstract abs);

    abstract public void remove(Abstract abs);

    abstract public String getStringTree();
    
    public abstract int TongTC();
    
    public abstract int TongHP();
}
