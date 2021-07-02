/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_decorator;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author ASUS
 */
public class TachChuoi extends Tokenize {

    String chuoi;

    public TachChuoi(String chuoi) {
        this.chuoi = chuoi;
    }

    @Override
    public List<String> tachChuoi() {

        String[] s2 = chuoi.split(" ");
        List<String> words = new ArrayList<>();
        
//        for (int j = 0; j < s2.length; j++) {
//            if(s2[j] == " "){
//                s2[j].replace(" ", "");
//            }            
//        }

        for (int i = 0; i < s2.length; i++) {
            
            words.add(s2[i]);//thêm phần tử này (s2) vào danh sahcs list
        }
        return words;
        //Trả về mảng chứa các từ đã cắt
    }
}
