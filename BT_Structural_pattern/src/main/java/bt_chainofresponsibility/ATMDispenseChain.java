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
public class ATMDispenseChain {

    DispenseChain c0;
//
    public ATMDispenseChain() {
        // initialize the chain
        this.c0 = new Dispenser200();
        DispenseChain c1 = new Dispenser100();
        DispenseChain c2 = new Dispenser50();
        DispenseChain c3 = new Dispenser20();
        DispenseChain c4 = new Dispenser5();
        DispenseChain c5 = new Dispenser2();
        DispenseChain c6 = new Dispenser1();

        c0.setNextChain(c1);
        c1.setNextChain(c2);
        c2.setNextChain(c3);
        c3.setNextChain(c4);
        c4.setNextChain(c5);
        c5.setNextChain(c6);
    }

}
