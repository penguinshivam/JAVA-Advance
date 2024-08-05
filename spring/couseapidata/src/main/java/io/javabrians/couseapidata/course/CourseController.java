package io.javabrians.couseapidata.course;
import java.util.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import io.javabrians.couseapidata.topic.Topic;
@RestController
public class CourseController {

    @Autowired
    private CourseService CourseService;

    @RequestMapping("/topics/{id}/courses")
    public List<Course> getAllCourses(@PathVariable String id){
        return CourseService.getAllCourses(id);
    }

    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Course> getCourse(@PathVariable String id){
        return CourseService.getCourse(id);
    }

    @RequestMapping(method = RequestMethod.POST,value = "/topics/{topicId}/courses")
    public void addCourse(@RequestBody Course course, @PathVariable String topicId){
        course.setTopic(new Topic(topicId,"",""));
        CourseService.addCourse(course);
    }

    @RequestMapping(method = RequestMethod.PUT,value = "/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Course course,@PathVariable String topicId,@PathVariable String id){
        course.setTopic(new Topic(topicId,"",""));
        CourseService.updateCourse(course);
    }
    @RequestMapping(method = RequestMethod.DELETE,value = "/topics/{topicId}/courses/{id}")
    public String deletetopic(@PathVariable String id){
        CourseService.deleteCourse(id);
        return "deleted successfully";
    }
    
}
