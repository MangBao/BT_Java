/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Date;

/**
 *
 * @author HP
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // TODO code application logic here
        SinhVien sv1 = new SinhVien("Mang Bao", new Date(100, 2, 22), 7);
        SinhVien sv2 = new SinhVien("Le Minh Long", new Date(100, 5, 5), 8);
        SinhVien sv3 = new SinhVien("Nguyen Van Tri", new Date(100, 6, 25), 9);
        
        QLSV qlsv = new QLSV();
        qlsv.listSV.add(sv1);
        qlsv.listSV.add(sv2);
        qlsv.listSV.add(sv3);
        
        ISoSanh ssTheoDiem = new SoSanhTheoDiem();
        qlsv.setSoSanh(ssTheoDiem);
        qlsv.sapXep();
        System.out.println("Sap xep theo diem tang dan: ");
        qlsv.inDS();
        System.out.println();
        
        ISoSanh ssTheoTen = new SoSanhTheoTen();
        qlsv.setSoSanh(ssTheoTen);
        qlsv.sapXep();
        System.out.println("Sap xep theo ten: ");
        qlsv.inDS();
    }
    
}
