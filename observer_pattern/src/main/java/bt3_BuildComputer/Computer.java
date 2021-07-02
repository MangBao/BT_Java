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
public class Computer {
    String hdd, memory, cpu, screen;
    int giaCPU, giaMem, giaHDD, giaSCR;
    int tongGia;

    @Override
    public String toString() {
        return "Computer{" + "hd=" + hdd + ", memory=" + memory + ", cpu=" + cpu + ", screen=" + screen + "}" 
               + " " + "Tong gia: " + tongGia;
    }
    
    

    protected Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.hdd = builder.hdd;
        this.memory = builder.memory;
        this.screen = builder.screen;
        this.giaCPU = builder.giaCPU;
        this.giaMem = builder.giaMem;
        this.giaHDD = builder.giaHDD;
        this.giaSCR = builder.giaSCR;
        
        tongGia = this.giaCPU + this.giaHDD + this.giaMem + this.giaSCR;
    }

    public static class Builder {

        String hdd, memory, cpu, screen;
        int giaCPU, giaMem, giaHDD, giaSCR;
        int tongGia;
        

        public Builder() {
        }
        

        public Builder addCPU(String cpu, int giaCPU) {
            this.cpu = cpu;
            this.giaCPU = giaCPU;
            return this;
        }

        public Builder addMemmory(String memory, int giaMem) {
            this.memory = memory;
            this.giaMem = giaMem;
            return this;
        }

        public Builder addHDD(String hdd, int giaHDD) {
            this.hdd = hdd;
            this.giaHDD = giaHDD;
            return this;
        }

        public Builder addScreen(String screen, int giaSCR) {
            this.screen = screen;
            this.giaSCR = giaSCR;
            return this;
        }
        
        public Computer build(){
            return new Computer(this);
        }
        
    }
}
