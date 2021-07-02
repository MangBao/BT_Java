/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai7_stream;

/**
 *
 * @author ASUS
 */
public class StreamMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Stream s = new Stream();
        
        s.dsChuoi.add("chuoi 1");
        s.dsChuoi.add("chuoi 2");
        s.dsChuoi.add("chuoi 3");
        
        Consumer consumer = new Consumer();
        
        consumer.setStream(s);
        consumer.dangKy();
        
        s.capNhatMoi(s.dsChuoi);
        
    }
    
}
