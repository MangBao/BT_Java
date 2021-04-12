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
public class Election {
    private  static  Election instance;
    boolean check = false;
    int dtr = 0 , jbd = 0;

    public Election() {
    }
    
    
    public static Election createInstance(){
        if (instance == null) {
            instance = new Election();
        }
        return instance;
    }
    
    public void vote(Candidate c){
        if (c == Candidate.DonaldTrump) {
            dtr++;
        }
        else if (c == Candidate.JoeBiden) {
            jbd++;
        }
    }
    
    
    
    public void printNum(){
        System.out.println("DonaldTrump: " + dtr + "\t" + "Joe Biden:" + jbd);
    }
}
