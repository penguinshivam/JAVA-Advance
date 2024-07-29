package io.javabrains.springbootquickstart.topic;

import java.util.*;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
    private List<Topic> topics=new ArrayList<>(Arrays.asList(
            new Topic("Spring","Spring Framework","Spring Framework Description"),
            new Topic("javacore","java Framework","Spring Framework Description"),
            new Topic("javascript","javascript Framework","Spring Framework Description")
        ));

    public List<Topic> getAllTopics(){
        return topics;
    }
    public Topic geTopic(String id){
        return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
    }
    public void addtopic(Topic topic) {
        topics.add(topic);
    }
    public void updatetopic(String id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t= topics.get(i);
            if (t.getId().equals(id)) {
                topics.set(i, topic);
                return;
            }
        }
    }
    public void deletetopic(String id) {
        topics.removeIf(t->t.getId().equals(id));
    }
}
