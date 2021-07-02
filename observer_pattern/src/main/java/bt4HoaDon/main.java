/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4HoaDon;
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
        DsHangHoa dstt = new ThanThiet();
        DsHangHoa dskc = new KimCuong();
        HangHoa item1 = new HangHoa("Xoài", 30, 50000);
        HangHoa item2 = new HangHoa("Cam", 5, 20000);
        HangHoa item3 = new HangHoa("Mận", 4, 50000);
               
        dstt.dsHangHoa.add(item1);
        dstt.dsHangHoa.add(item2);
        dstt.dsHangHoa.add(item3);
        dstt.hienthiThongtin();
        
        System.out.println("");
        
        dskc.dsHangHoa.add(item1);
        dskc.dsHangHoa.add(item2);
        dskc.dsHangHoa.add(item3);
        dskc.hienthiThongtin();
    }
    
}
