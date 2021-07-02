/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_ui;

/**
 *
 * @author ASUS
 */
public class DataAccess extends EntityDB<SanPham> {

    //Cài đặt singleton cho DataAccess
    private static DataAccess instance;
    //Che đậy Constructor
    protected DataAccess() {}

    //Phương thức khởi tạo DataAccess
    public static DataAccess Instance() {
        if (instance == null) {
            instance = new DataAccess();
        }
        return instance;
    }

    @Override
    protected SanPham findByMaSP(String maSP) {
        //thua ke tu list, tim trong list
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).maSP == maSP) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    protected String getMaSP(SanPham t) {
        return t.maSP;
    }
}
