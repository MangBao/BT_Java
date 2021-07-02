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
public class LopTV_A implements Topic.TopicObserver{
    Topic dvTopic;
    String topic;

    public void setTopic(Topic topic) {
        this.dvTopic = topic;
    }
    

    public void dangKy() {//đk observer cho topic
        this.dvTopic.dangKy(this);
        this.topic = this.dvTopic.topic;//khi nào đk thì lấy luôn gt ban đầu
    }

    public void huyDangKy() {
        this.dvTopic.huyDangKy(this);
    }

    @Override
    public void capNhat(String topicMoi) {
        if (topicMoi != null) {
            topicMoi = dvTopic.topic;
        }
        System.out.println("Thành viên A da nhan tin:  " + topicMoi);
        this.topic = topicMoi;
    }
}
