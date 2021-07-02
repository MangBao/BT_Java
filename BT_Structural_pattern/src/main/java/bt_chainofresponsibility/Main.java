/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt_chainofresponsibility;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Main {

    public static void main(String[] args) {

//        DispenseChain dispenseChain = ATMDispenseChain.;
        ATMDispenseChain atmDispenser = new ATMDispenseChain();

        while (true) {
            int amount = 0;
            System.out.println("Nhap so tien: ");
            Scanner input = new Scanner(System.in);
            amount = input.nextInt();
            if (amount <= 0) {
                throw new InputMismatchException(amount + " be hon 0");
            }
            // process the request
//            atmDispenser.c1.dispense(new Currency(amount));
            atmDispenser.c0.dispense(amount);
        }
        
    }
}
