/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singleton;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        SingletonDemo s1 = SingletonDemo.creSingletonDemo();
        SingletonDemo s2 = SingletonDemo.creSingletonDemo();
        s1.increaseCount();
        s1.increaseCount();
        s1.increaseCount();
        s1.increaseCount();
        s1.increaseCount();
        s2.increaseCount();
        s1.printInfo();
        
    }
}
