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
public class SingletonDemo {

    private static SingletonDemo instance;
    int count = 0;

    protected SingletonDemo() {

    }

    public static SingletonDemo creSingletonDemo() {
        if (instance == null) {
            instance = new SingletonDemo();
        }
        return instance;
    }

    public void increaseCount() {
        count++;
    }

    public void printInfo() {
        System.out.println("cOUNT: " + count);
    }
}
