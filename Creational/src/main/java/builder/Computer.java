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
public class Computer {

    String hd, memory, cpu, screen;

    @Override
    public String toString() {
        return "Computer{" + "hd=" + hd + ", memory=" + memory + ", cpu=" + cpu + ", screen=" + screen + '}';
    }
    

    protected Computer(Builder builder) {
        this.cpu = builder.cpu;
        this.hd = builder.hd;
        this.memory = builder.memory;
        this.screen = builder.screen;
    }

    public static class Builder {

        String hd, memory, cpu, screen;

        public Builder() {
        }
        

        public Builder addCPU(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public Builder addMemmory(String memory) {
            this.memory = memory;
            return this;
        }

        public Builder addHD(String hd) {
            this.hd = hd;
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
