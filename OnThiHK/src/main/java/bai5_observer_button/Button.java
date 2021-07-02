/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai5_observer_button;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Button {

    //chứa 1 ds các observer(đối tượng thực thi)
    List<ButtonObserver> listeners = new ArrayList<>();
    int dem;

    public Button(int dem) {
        this.dem = dem;
    }   
    
    public void dangKy(ButtonObserver btnobserver) {        
        if (!listeners.contains(btnobserver)) {
            listeners.add(btnobserver);
        }     
    }
    
    public void clickBtn(){
        this.dem++;
        for (ButtonObserver btnObs : listeners) {
            btnObs.click(dem);
        }
    }
    
    public static interface ButtonObserver {
        void click(int dem);
    }
}
