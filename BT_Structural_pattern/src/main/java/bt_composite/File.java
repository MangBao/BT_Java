/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_composite;

/**
 *
 * @author ASUS
 */
public class File extends StorageUnit {

    public File(String name) {
        super(name);
    }

    @Override
    public void addElement(StorageUnit element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeElement(StorageUnit element) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getNumberOfSubelements() {
        return 0;
    }

    @Override
    protected void remove(StorageUnit parent) {
        System.out.println("Remove File " + getName()
                + " from " + parent.getName());
    }

}
