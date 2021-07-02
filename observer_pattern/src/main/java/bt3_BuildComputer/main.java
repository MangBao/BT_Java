/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3_BuildComputer;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        Computer.Builder buidler = new Computer.Builder();
        Computer computer = buidler.addCPU("Core i9 12900 3GHz", 8000000)
                .addMemmory("32GB Samsung DDR5 3200MHz", 3500000)
                .addHDD("SSD 2TB", 3600000)
                .addScreen("21 Inches LG 4K", 4900000)
                .build();        
        
        System.out.println(computer.toString());
    }
}
