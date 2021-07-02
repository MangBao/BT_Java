/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3_template_method;
/**
 *
 * @author ASUS
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HangHoa item1 = new HangHoa("Chuoi", 20, 60000);
        HangHoa item2 = new HangHoa("Buoi", 5, 20000);
        HangHoa item3 = new HangHoa("Dao", 4, 50000); 
        
        HoaDon khtt = new ThanThiet();
        HoaDon khkc = new KimCuong();
                      
        
        khtt.dsHangHoa.add(item1);
        khtt.dsHangHoa.add(item2);
        khtt.dsHangHoa.add(item3);
        khtt.hienthiThongtin();
        
        System.out.println("-----------------------------");
        
        khkc.dsHangHoa.add(item1);
        khkc.dsHangHoa.add(item2);
        khkc.dsHangHoa.add(item3);
        khkc.hienthiThongtin();
    }
    
}
