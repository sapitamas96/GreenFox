package com.example.classes.contollers;

import com.example.classes.modells.Person;
import com.example.classes.modells.Student;
import com.example.classes.modells.Teacher;
import com.example.classes.services.ClassroomService;
import com.example.classes.services.StudentService;
import com.example.classes.services.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SchoolController {

    private ClassroomService classroomService;
    private StudentService studentService;
    private TeacherService teacherService;

    @Autowired
    public SchoolController(ClassroomService classroomService, StudentService studentService, TeacherService teacherService) {
        this.classroomService = classroomService;
        this.studentService = studentService;
        this.teacherService = teacherService;
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/teacher/add")
    public String addTeacher() {
        return "addTeacher";
    }

    @PostMapping("/teacher/add")
    public String addTeacherPost(@ModelAttribute Teacher teacher) {
        teacherService.add(teacher);
        return "redirect:/index";
    }

    @GetMapping("/student/add")
    public String addStudent() {
        return "addStudent";
    }

    @PostMapping("/student/add")
    public String addStudentPost(@ModelAttribute Student student) {
        studentService.add(student);
        return "redirect:/index";
    }
}
