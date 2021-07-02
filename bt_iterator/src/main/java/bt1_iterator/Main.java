/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1_iterator;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        ConcreteAggrerate aa = new ConcreteAggrerate();
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        aa.setMenuItems(cars);
        Iterator iterator = aa.createIterator();
        System.out.println(iterator.first());
        while(!iterator.isDone()) {
            System.out.println(iterator.next());
        }
    }
}
