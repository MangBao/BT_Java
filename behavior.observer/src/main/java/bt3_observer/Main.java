/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3_observer;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        // TODO code application logic here
        //Topic topic = new Topic("tin mới");
        
        Topic topic = new Topic("Python");
        
        LopTV_A thanhVienA = new LopTV_A();
        LopTV_B thanhVienB = new LopTV_B();
        thanhVienA.setTopic(topic);
        //thanhVienB.setTopic(topic);
        
        thanhVienA.dangKy();
        //thanhVienB.dangKy();
        
        topic.capnhatTin("Python basic");
        //System.out.println("");
        //topic.capnhatTin("Python advance");
    }
}
