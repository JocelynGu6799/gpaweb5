package cuz.gpaweb.controller;

import com.google.gson.Gson;
import mapper.StudentMapper;
import model.Student2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
public class StudentController {
    @Autowired
    private StudentMapper studentMapper;
    private int y;
    private Gson gson=new Gson();

    @GetMapping("/student")
    public String getStudentList(){

        List<Student2>studentList=studentMapper.selectList(null);
        return gson.toJson(studentList);
    }
    @GetMapping("/student/{id}")
    public String getStudentList(@PathVariable("id")String id){
        Student2 s=studentMapper.selectById(id);
        return gson.toJson(s);

    }
    @PostMapping("/addstudent")
    public void AddStudent(@RequestBody Student2 student){
        studentMapper.insert(student);
    }
    @DeleteMapping("/deletestudent")
    public void DeleteStudent(@RequestBody Student2 student){
        studentMapper.deleteById(student);

    }
    @PutMapping("/updatestudent")
    public void UpdateStudent(@RequestBody Student2 student){
        studentMapper.updateById(student);
    }





}
