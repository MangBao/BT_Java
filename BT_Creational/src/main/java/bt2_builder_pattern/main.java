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
public class main {
    public static void main(String[] args) {
        MyStringBuilder.Builder builder = new MyStringBuilder.Builder();
        MyStringBuilder mStr = builder.addString("bao")
                .addFloat(15)
                .addBool(true)
                .build();
        mStr.str = "mang";
        
        System.out.println(mStr.str + mStr.toString());
    }
}
