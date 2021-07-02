/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt6;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Computer {
    List<String> hdd = new ArrayList<>();
    List<String> memory = new ArrayList<>();
    String cpu, screen;
    int giaCPU, giaMem, giaHDD, giaSCR;
    int tongGia;

    @Override
    public String toString() {
        return "Computer{" + "hd=" + hdd.toString() + ", memory=" + memory + ", cpu=" + cpu + ", screen=" + screen + "}";
    }
    
    

    protected Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.hdd = builder.hdd;
        this.memory = builder.memory;
        this.screen = builder.screen;
        
    }

    public static class Builder {

        List<String> hdd = new ArrayList<>();
        List<String> memory = new ArrayList<>();
        String cpu, screen;        

        public Builder() {
        }        

        public Builder addCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder addMemmory(String memory) {
            this.memory.add(memory);
            return this;
        }

        public Builder addHDD(String hdd) {
            this.hdd.add(hdd);
            return this;
        }

        public Builder addScreen(String screen) {
            this.screen = screen;
            return this;
        }
        
        public Computer build(){
            return new Computer(this);
        }
        
    }
}
