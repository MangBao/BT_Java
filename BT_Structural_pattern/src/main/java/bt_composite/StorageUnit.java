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
public abstract class StorageUnit {
    private String name;

	public StorageUnit(String name) {
		this.name = name;
	}

	public String getName() {return name;}
	public abstract void addElement(StorageUnit element);
	public abstract void removeElement(StorageUnit element);
	public abstract int getNumberOfSubelements();
	protected abstract void remove(StorageUnit parent);
	
}
