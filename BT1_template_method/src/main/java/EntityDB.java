
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public abstract class EntityDB<T> {

    ArrayList<T> list = new ArrayList();

    //Dấu # là protected, dấu + là public
    protected abstract T findByID(int id);

    protected abstract int getID(T t);

    public boolean add(T t) {
        if (findByID(getID(t)) == null) {
            list.add(t);
            return true;
        }
        return false;
    }

    public int update(T t) {
        T old = findByID(getID(t));
        if (old != null) {
            int index = list.indexOf(old); // lấy 1 đối tượng T bên ngoài khoog indexOf đc nên phải lấy thông qua old
            list.set(index, t);
            return 1;
        } else {
            return 0;
        }
    }

    public int delete(T t) {
//        T toDelete = findByID(getID(t));
//        if (toDelete != null) {
//            list.remove(toDelete);
//            return 1;
//        } else {
//            return 0;
//        }
        return deleteByID(getID(t));
    }

    public int deleteByID(int id) {
        T toDelete = findByID(id);
        if (toDelete != null) {
            list.remove(toDelete);
            return 1;
        }
        return 0;
    }
    
    public void printInfo(){
        list.forEach((item) -> {
            System.out.println(item.toString());
        });
    }
}
