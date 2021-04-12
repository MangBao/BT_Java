/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        Computer.Builder buidler = new Computer.Builder();
        Computer computer = buidler.addCPU("Core i9 12900 3GHz")
                .addMemmory("32GB Samsung DDR5 3200MHz")
                .addHD("SSD 2TB")
                .addScreen("21 Inches LG 4K")
                .build();
        System.out.println(computer.toString());
    }    
}
