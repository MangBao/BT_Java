/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class MonhocDB extends EntityDB<Monhoc>{

    @Override
    protected Monhoc findByID(int id) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).maMH == id) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    protected int getID(Monhoc t) {
        return t.maMH;
    }
    
}
