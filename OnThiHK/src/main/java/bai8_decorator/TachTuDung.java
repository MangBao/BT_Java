/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_decorator;

import java.util.List;
import java.util.Arrays;
/**
 *
 * @author ASUS
 */
public class TachTuDung extends TokenizetDecorater{
    
    public TachTuDung(Tokenize toke) {
        super(toke);
    }
    
    @Override
    public List<String> tachChuoi() {
        List<String> tuDung = Arrays.asList("và","thì","hoặc","mà","là");
        List<String> list =super.tachChuoi();
        
        for (int i=0;i < list.size();i++) {//Trả về số phần tử trong danh sách này
            for (int j=0;j < tuDung.size();j++) {
                if(list.get(i).equals(tuDung.get(j))){//phần từ chỉ định trong danh sách
                    list.remove(list.get(i));
                }
            }
        }
        return list;
    }
}
