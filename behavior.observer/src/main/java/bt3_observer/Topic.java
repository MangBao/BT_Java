/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3_observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ASUS
 */
public class Topic {
    List<TopicObserver> listenrs = new ArrayList<>();
    String topic;

    public Topic(String topic) {
        this.topic = topic;
    }
    
    public void dangKy(TopicObserver observer) {
        if (!listenrs.contains(observer)) {
            listenrs.add(observer);
        }
    }

    public void huyDangKy(TopicObserver observer) {
        if (listenrs.contains(observer)) {
            listenrs.remove(observer);
        }
    }

    public void capnhatTin(String topicMoi) {
        this.topic = topicMoi;
        for (TopicObserver o : listenrs) {
            o.capNhat(topicMoi);
        }
    }

    public static interface TopicObserver {

        void capNhat(String topicMoi);
    }
}
