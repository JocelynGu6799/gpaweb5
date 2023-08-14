package cuz.gpaweb.controller;

import com.google.gson.Gson;
import mapper.CourseMapper;
import mapper.StudentMapper;
import model.Course;
import model.Student2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@CrossOrigin("*")
public class CourseController {
    @Autowired
     CourseMapper courseMapper;
    private Gson gson=new Gson();
    @GetMapping("/course")

    public String getCourseList(){

        List<Course> courseList=courseMapper.selectList(null);
        return gson.toJson(courseList);
    }
    @PostMapping("/addcourse")
    public void AddStudent(@RequestBody Course course){
        courseMapper.insert(course);
    }
    @DeleteMapping("/deletecourse")
    public void DeleteStudent(@RequestBody Course course){
        courseMapper.deleteById(course);

    }
    @PutMapping("/updatecourse")
    public void UpdateStudent(@RequestBody Course course){
        courseMapper.updateById(course);
    }


}
