/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_composite;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author ASUS
 */
public class Folder extends StorageUnit {

	private final CopyOnWriteArrayList< StorageUnit > subelements;
	
	public Folder(String name) {
		super(name);
		this.subelements = new CopyOnWriteArrayList<>();
	}
	
	public void removeElement(StorageUnit element) {
		element.remove(this);
		subelements.remove(element);
	}

	public void addElement(StorageUnit element) {
		if (subelements.addIfAbsent(element)) {
			System.out.println("Add " + element.getName() + 
				" to " + this.getName());
		}
	}

	/**
	 * Remove elements recursively. No need to worry about 
	 * concurrent modifications here since we use 
	 * {@link CopyOnWriteArrayList} for simplicity.
	 * Might not be the best solution for every situation.
	 */
	protected void remove(StorageUnit parent) {
		for (StorageUnit element : subelements) {
			element.remove(this);
		}
		System.out.println("Remove Folder " + getName() + 
			" from " + parent.getName());
	}

	public int getNumberOfSubelements() {
		int tmp = subelements.size();
		for (StorageUnit element : subelements) {
			tmp += element.getNumberOfSubelements();
		}
		return tmp;
	}
}
