package io.javabrians.couseapidata.course;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
    
    @Autowired
    private CourseRepository CourseRepository;

    public List<Course> getAllCourses(String topicId){
        // return topics;
        List<Course> courses = new ArrayList<>();
        CourseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }
    public Optional<Course> getCourse(String id){
        // return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
        return CourseRepository.findById(id);
    }
    public void addCourse(Course course) {
        // topics.add(topic);
        CourseRepository.save(course);
    }
    public void updateCourse(Course topic) {
        // for (int i = 0; i < topics.size(); i++) {
        //     Topic t= topics.get(i);
        //     if (t.getId().equals(id)) {
        //         topics.set(i, topic);
        //         return;
        //     }
        // }
        CourseRepository.save(topic);
    }
    public void deleteCourse(String id) {
        // topics.removeIf(t->t.getId().equals(id));
        CourseRepository.deleteById(id);
    }
}
