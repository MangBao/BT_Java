/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt1_iterator;

/**
 *
 * @author ASUS
 */
public class ConcreteAggrerate extends Aggrerate <Object>{

    private Object[] menuItems;

    public void setMenuItems(Object[] menuItems) {
        this.menuItems = menuItems;
    }
    
    @Override
    Iterator<Object> createIterator() {
        return new ConcreteIterator(this);
    }
    
    int count() {
        return menuItems.length;
    }
    Object getItem(int i) {
        return menuItems[i];
    }
}