/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_decorator;

import java.util.List;

/**
 *
 * @author ASUS
 */
public class TachDauCau extends TokenizetDecorater {

    public TachDauCau(Tokenize beverage) {
        super(beverage);
    }
    
    @Override
    public List<String> tachChuoi() {
        List<String> list = super.tachChuoi();
        
        for (int i=0;i < list.size();i++) {
                if(list.get(i).equals(";")){
                    list.remove(";");
                }
        }
        return list;
    }

}
