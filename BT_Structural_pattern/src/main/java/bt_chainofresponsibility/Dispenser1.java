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
public class Dispenser1 implements DispenseChain {

    private DispenseChain chain;

    @Override
    public void setNextChain(DispenseChain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void dispense(int cur) {
        if (cur < 1) {
            chain.dispense(cur);

        } else {
            int num = cur / 1;
            int remainder = cur % 1;
            System.out.println("Rut duoc " + num + "to 1 VND");
            if (remainder != 0) {
                chain.dispense(remainder);
            }
        }
    }
}
