/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_decorator.beverage;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        Beverage b = new DarkRoast("Ca phe nuoc tuong");
        b = new Milk(b, "cf sua");
        b = new Soy(b, "dau nanh");
        System.out.println(b.getDesciption());
        System.out.println(b.cost());
    }
}
