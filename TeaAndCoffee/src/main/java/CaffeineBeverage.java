/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

public abstract class CaffeineBeverage {
    public void prepareRecipe(){
        boilwater();
        brew();
        pourInCup();
        addCondiments();
    }
    
    public void pourInCup() {
        System.out.println("Rot ra ly");
    }

    public void boilwater() {
        System.out.println("Dun soi nuoc");
    }

    abstract void brew();
    abstract void addCondiments();
}
