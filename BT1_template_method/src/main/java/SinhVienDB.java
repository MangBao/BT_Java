/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SinhVienDB extends EntityDB<SinhVien> {

    @Override
    protected SinhVien findByID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).id == id) {
                return list.get(i);
            }
        }
        return null;
//        list.forEach((item) -> {  
//            if(id == list.get(item).id){
//                return list.get(item);
//            }
//        });
    }

    @Override
    protected int getID(SinhVien t) {
        return t.id;
    }

}
