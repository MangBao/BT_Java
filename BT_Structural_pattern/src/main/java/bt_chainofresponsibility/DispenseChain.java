/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_chainofresponsibility;

/**
 *
 * @author ASUS
 */
public interface DispenseChain {

    void setNextChain(DispenseChain nextChain);

    void dispense(int cur);
}
