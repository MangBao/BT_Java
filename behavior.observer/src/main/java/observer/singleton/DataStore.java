/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer.singleton;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class DataStore extends Sach {

    List<Sach> storeSach = new ArrayList<>();
    public static DataStore dataStoreInstance;

    protected DataStore() {
    }

    public static DataStore getInstance() {
        if (dataStoreInstance == null) {
            dataStoreInstance = new DataStore();
        }
        return dataStoreInstance;
    }
    
    public void addBooks(Sach s){
        if(storeSach != null)
            storeSach.add(s);
    }

    @Override
    public void setGiaBan(int giaBan) {
        super.setGiaBan(giaBan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getGiaBan() {
        return super.getGiaBan(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setNhaXuatBan(String nhaXuatBan) {
        super.setNhaXuatBan(nhaXuatBan); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getNhaXuatBan() {
        return super.getNhaXuatBan(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setTenSach(String tenSach) {
        super.setTenSach(tenSach); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTenSach() {
        return super.getTenSach(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setMaSach(String maSach) {
        super.setMaSach(maSach); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getMaSach() {
        return super.getMaSach(); //To change body of generated methods, choose Tools | Templates.
    }

}
