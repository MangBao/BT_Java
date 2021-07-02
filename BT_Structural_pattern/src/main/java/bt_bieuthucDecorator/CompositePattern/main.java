/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_bieuthucDecorator.CompositePattern;

/**
 *
 * @author ASUS
 */
public class main {
    public static void main(String[] args) {
        AbstractFile data = new Folder("data", "30/04/2021");
        AbstractFile toan = new Folder("toan", "30/04/2021");
        AbstractFile ly = new Folder("ly", "30/04/2021");
        AbstractFile hoa = new Folder("hoa", "30/04/2021");
        AbstractFile giaiTich = new Folder("BT_GIAITHIC", "30/04/2021");
        
        AbstractFile giaiTich_A = new File("giaiTich_A.pdf", "30/04/2021");
        AbstractFile hinhNY = new File("ny.jpg", "30/04/2021");
        
        data.add(toan);
        data.add(ly);
        data.add(hoa);
        
        toan.add(giaiTich);
        giaiTich.add(giaiTich_A);
        data.add(hinhNY);
        
        System.out.println("Cay thu muc data");
        System.out.println(data.getStringTreeFolder());
        System.out.println("");
        System.out.println("Cay thu muc toan");
        System.out.println(toan.getStringTreeFolder());
        System.out.println(giaiTich_A.getPath());
    }
}
