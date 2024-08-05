package io.javabrians.couseapidata.topic;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
public class TopicController {

    @Autowired
    private TopicService topicService;

    @RequestMapping("/topics")
    public List<Topic> getAllTopics(){
        return topicService.getAllTopics();
    }

    @RequestMapping("/topics/{id}")
    public Optional<Topic> getTopic(@PathVariable String id){
        return topicService.geTopic(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics")
    public void addtopic(@RequestBody Topic topic){
        topicService.addtopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{id}")
    public void updatetopic(@RequestBody Topic topic,@PathVariable String id){
        topicService.updatetopic(id,topic);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{id}")
    public String deletetopic(@PathVariable String id){
        topicService.deletetopic(id);
        return "deleted successfully";
    }
    
}
