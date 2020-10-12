package vn.codegym.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import vn.codegym.model.Student;
import vn.codegym.service.StudentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student")
    public ResponseEntity<List<Student>> getStudentList(){
        List<Student> studentList = studentService.findAll();
        if(studentList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(studentList, HttpStatus.OK);
    }

    @PostMapping("/student")
    public ResponseEntity addStudent(@RequestBody Student student){
        studentService.save(student);
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student> findStudentById(@PathVariable int id){
        Student student = studentService.findById(id);
        if(student==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(student, HttpStatus.OK);
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Student> updateStudent(@PathVariable int id, @RequestBody Student student){
        Student currentStudent = studentService.findById(id);
        if(currentStudent==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        currentStudent.setName(student.getName());
        currentStudent.setAddress(student.getAddress());
        currentStudent.setAge(student.getAge());
        currentStudent.setGender(student.getGender());
        currentStudent.setRole(student.getRole());

        studentService.save(currentStudent);

        return new ResponseEntity<>(currentStudent, HttpStatus.OK);
    }
}
