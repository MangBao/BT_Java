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
public class main {
    public static void main(String[] args) {
        Election e = Election.createInstance();
        User u1 = new User("Bao");
        User u2 = new User("Long");
        User u3 = new User("Tri");
        
        u1.vote(Candidate.DonaldTrump);
        u2.vote(Candidate.DonaldTrump);
        u2.vote(Candidate.JoeBiden);
        e.printNum();
    }
}
