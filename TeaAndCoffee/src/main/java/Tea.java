/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Tea extends CaffeineBeverage {  
    @Override
    void brew() {
        System.out.println("Pha tra");
    }

    @Override
    void addCondiments() {
        System.out.println("Them chanh");
    }
}
