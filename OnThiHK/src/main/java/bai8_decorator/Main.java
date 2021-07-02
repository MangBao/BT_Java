/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_decorator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tokenize t = new TachChuoi("Chieu hom qua, Bao di choi; và di an ; là cung 1 nguoi");

        List<String> aList = new ArrayList<>();
//        new TachTuDung(t);
        new TachDauCau(t);
        
        aList = t.tachChuoi();
        
        for (int i = 0; i < aList.size(); i++) {
            System.out.println(aList.get(i));
        }
    }

}
