/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai6_composite;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class QLMonHoc extends Abstract {

    List<Abstract> list = new ArrayList<>();
    
    public QLMonHoc(String ten) {
        super(ten);
    }
    
    @Override
    public void add(Abstract abs) {
        //trong cùng thư muc ko chứa 2 thư mục giống nhau
        if (!list.contains(abs)) {
            list.add(abs);
        }
    }

    @Override
    public void remove(Abstract abs) {
        //cau lenh dej quy ket thuc
        if (list.contains(abs)) {//neu chua file do thi xoa
            list.remove(abs);
            return;
        }
        //neu ko co thi xuong con tim
        for (Abstract folder : list) {
            folder.remove(abs);
        }
    }

    @Override
    public String getStringTree() {
        //đưa zô cây thư mục là cây con
        StringBuilder builder = new StringBuilder();//lấy Stringbuilder
        builder.append(preStr)
                .append(ten);//thêm tên zô
        //gép cây con vào
        for (Abstract f : list) {
            //tính lại
            f.preStr = this.preStr + "..";//in ký tự

            builder.append("\n")
                    .append(f.getStringTree());//geps vào
            //in xong trả lại như cũ
            f.preStr = "";
        }
        return builder.toString();
    }

    @Override
    public int TongTC() {
        int phi = 0;
        for (int i = 0; i < list.size(); i++) {
            phi += list.get(i).TongTC();
        }
        return phi;
    }

    @Override
    public int TongHP() {
        int phi = 0;
        for (int i = 0; i < list.size(); i++) {
            phi += list.get(i).TongHP();
        }
        return phi;
    }

}
