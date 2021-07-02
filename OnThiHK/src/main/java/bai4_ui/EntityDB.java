/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4_ui;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class EntityDB<T> {

    List<T> list = new ArrayList<>();

    protected abstract T findByMaSP(String maSP);

    protected abstract String getMaSP(T t);

    public boolean add(T t) {
        //tìm xem masp thêm vào có bị trùng với masp đã có hay không
        if (findByMaSP(getMaSP(t)) == null) {
            list.add(t);//theem thành công thì trả về true, ngược lại
            return true;
        }
        return false;
    }

    public int update(T t) {
        //tìm xem masp đã có (old) có khớp với sản phẩm cần cập nhật hay không?
        T old = findByMaSP(getMaSP(t));//tim ra doi tuong can cập nhật
        if (old != null) {
            //old lay doi tuong trong danh sach
            int index = list.indexOf(old);//lay vi tri can cap nhat
            list.set(index, t);
            return 1;
        }
        //up ko dc tra ve 0 
        return 0;
    }

    //Dùng để gọi phương thức deleteByMaSP
    public int delete(T t) {
        return deleteByMaSP(getMaSP(t));
    }

    public int deleteByMaSP(String maSP) {
        //tìm xem sản phẩm cần xóa có tồn tại trong cơ sở dữ liệu không?
        T toDelete = findByMaSP(maSP);
        if (toDelete != null) {
            list.remove(toDelete);
            return 1;
        }
        return 0;
    }
    
    //hàm in ra để kt
    public void printInfo() {
        list.forEach((t) -> {
            System.out.println(t.toString());
        });
    }
}
