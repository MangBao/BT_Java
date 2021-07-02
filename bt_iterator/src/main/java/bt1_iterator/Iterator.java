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
public abstract class Iterator <T>{
    abstract T first();
    abstract T next();
    abstract boolean isDone();
    abstract T currentItem();

}
