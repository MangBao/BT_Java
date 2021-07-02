/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt3_observer;

/**
 *
 * @author ASUS
 */
public class LopTV_B implements Topic.TopicObserver{
    Topic dvTopic;
    String topic;
    int stt = 0;

    public void setTopic(Topic topic) {
        this.dvTopic = topic;
    }

    public void dangKy() {
        this.dvTopic.dangKy(this);
        this.topic = this.dvTopic.topic;
    }

    public void huyDangKy() {
        this.dvTopic.huyDangKy(this);
    }

    @Override
    public void capNhat(String topicMoi) {
        if (topicMoi != null) {
            stt++;
            System.out.println("Thanh vien B da nhan tin cu: " + topic);
            System.out.println("Thanh vien B da nhan tin moi thu: " + stt +". "+ topicMoi);
        }
        this.topic = topicMoi;
        //stt++;
    }
}
