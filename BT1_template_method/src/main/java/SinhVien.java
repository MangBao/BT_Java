/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class SinhVien {

    int id;
    String name;
    String lop;

    public SinhVien(int id, String name, String lop) {
        this.id = id;
        this.name = name;
        this.lop = lop;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "id: " + id + "\n" + "name: " + name + "\n" + "class: " + lop; //To change body of generated methods, choose Tools | Templates.
    }
}
