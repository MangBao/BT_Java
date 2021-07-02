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
public class ConcreteIterator extends Iterator<Object> {

    ConcreteAggrerate aggrerate;
    int currentIndex;

    public ConcreteIterator(ConcreteAggrerate aggrerate) {
        this.aggrerate = aggrerate;
    }

    @Override
    Object first() {
        currentIndex = 0;
        return aggrerate.getItem(currentIndex);
    }

    @Override
    Object next() {
        if(!isDone()) {
            currentIndex++;
            return aggrerate.getItem(currentIndex);
        }
        return null;
    }

    @Override
    boolean isDone() {
        if(currentIndex >= aggrerate.count() - 1) {
            return true;
        }
        return false;
    }
    
    @Override
    Object currentItem() {
        return aggrerate.getItem(currentIndex);
    }

    
}
