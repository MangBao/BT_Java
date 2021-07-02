/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai8_decorator;

import java.util.List;

/**
 *
 * @author ASUS
 */
public abstract class TokenizetDecorater extends Tokenize {

    Tokenize tokenize;

    public TokenizetDecorater(Tokenize toke) {
        this.tokenize = toke;
    }

    @Override
    public List<String> tachChuoi() {
        return tokenize.tachChuoi();
    }

}
