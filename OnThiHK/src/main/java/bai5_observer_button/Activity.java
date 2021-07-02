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
public class Activity implements Button.ButtonObserver{
    Button btn;
    int dem;

    public Activity(Button btn) {
        this.btn = btn;
        this.btn.dangKy(this);
    }
    
    @Override
    public void click(int dem) {
        if (dem == 0) {
            dem = btn.dem++;
        }
        System.out.println("Ban da click lan thu: " + dem);
        this.dem = dem;
    }
    
}
