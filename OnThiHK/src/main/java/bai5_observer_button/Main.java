/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_observer_button;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        Button btn = new Button(0);
        new Activity(btn);
        
        btn.clickBtn();
        btn.clickBtn();
    }
}
