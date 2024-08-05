package io.javabrians.couseapidata.topic;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
    
    @Autowired
    private TopicRepository topicRepository;

    public List<Topic> getAllTopics(){
        // return topics;
        List<Topic> topic = new ArrayList<>();
        topicRepository.findAll().forEach(topic::add);
        return topic;
    }
    public Optional<Topic> geTopic(String id){
        // return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        return topicRepository.findById(id);
    }
    public void addtopic(Topic topic) {
        // topics.add(topic);
        topicRepository.save(topic);
    }
    public void updatetopic(String id, Topic topic) {
        // for (int i = 0; i < topics.size(); i++) {
        //     Topic t= topics.get(i);
        //     if (t.getId().equals(id)) {
        //         topics.set(i, topic);
        //         return;
        //     }
        // }
        topicRepository.save(topic);
    }
    public void deletetopic(String id) {
        // topics.removeIf(t->t.getId().equals(id));
        topicRepository.deleteById(id);
    }
}
