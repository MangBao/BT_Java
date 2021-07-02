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
public class Dispenser20 implements DispenseChain {

    DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(int cur) {
        if (cur < 20) {
            chain.dispense(cur);

        } else {
            int num = cur / 20;
            int remainder = cur % 20;
            System.out.println("Rut duoc " + num + "to 20 VND");
            if (remainder != 0) {
                chain.dispense(remainder);
            }
        }
    }
}
