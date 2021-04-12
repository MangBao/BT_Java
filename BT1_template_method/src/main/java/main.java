/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class main {

    public static void main(String[] args) {
        EntityDB svDB = new SinhVienDB();
        svDB.add(new SinhVien(1, "Bao", "CNTT-1"));
        svDB.add(new SinhVien(2, "Long", "CNTT-1"));
        svDB.list.forEach((t) -> {
            System.out.println(t);
        });

        EntityDB mhDB = new MonhocDB();
        mhDB.add(new Monhoc(1, "Mau thiet ke", 3));
                
        mhDB.add(new Monhoc(2, "Lap trinh Android", 3));

    }
}
