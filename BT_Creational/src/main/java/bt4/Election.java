/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Election {

    private static Election instance;
    int dtr = 0, jbd = 0;

    List<String> listUserHadVoted = new ArrayList<>();

    public Election() {
    }

    public static Election createInstance() {
        if (instance == null) {
            instance = new Election();
        }
        return instance;
    }

    public void vote(Candidate c, String name) {
        if (listUserHadVoted != null) {
            listUserHadVoted.forEach((t) -> {
                if (t.equals(name)) {
                    throw new InputMismatchException(name + " da tham gia bau cu nhieu hơn 1 lan!");
                    
                }
            });
        }

        switch (c) {
            case DonaldTrump:
                dtr++;
                listUserHadVoted.add(name);
                break;
            case JoeBiden:
                jbd++;
                listUserHadVoted.add(name);
                break;
            default:
                break;
        }
    }

    public void printNum() {
        System.out.println("DonaldTrump: " + dtr + "\t" + "Joe Biden:" + jbd);
    }
}
