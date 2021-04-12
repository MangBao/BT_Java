/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt2_builder_pattern;

/**
 *
 * @author ASUS
 */
public class MyStringBuilder {

    String str, s;
    float f;
    boolean b;

    protected MyStringBuilder(Builder builder) {
        this.s = builder.s;
        this.f = builder.f;
        this.b = builder.b;
    }

    public static class Builder {

        String s;
        float f;
        boolean b;

        public Builder() {
        }

        public Builder addString(String s) {
            this.s = s;
            return this;
        }

        public Builder addFloat(float f) {
            this.f = f;
            return this;
        }

        public Builder addBool(boolean b) {
            this.b = b;
            return this;
        }

        public MyStringBuilder build() {
            return new MyStringBuilder(this);
        }

    }
    
    @Override
    public String toString() {
        return " " + s + " " + f + " " + b;
    }
}
