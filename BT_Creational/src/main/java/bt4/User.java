/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

/**
 *
 * @author ASUS
 */
public class User {

    String name;
    boolean check = false;

    public User(String name) {
        this.name = name;
    }

    public void vote(Candidate c) {
        if (check) {
            Election e = Election.createInstance();
            e.vote(c);
        }
        check = true;
    }
}
