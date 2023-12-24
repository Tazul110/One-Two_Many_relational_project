package com.example.demo.sms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.sms.Model.Laptop;
import com.example.demo.sms.Model.Student;
import com.example.demo.sms.Repository.LaptopRepository;
import com.example.demo.sms.Repository.StudentRepository;

@Controller
public class StudentController {

    @Autowired
    private StudentRepository studentRepository;
    
    @Autowired
    private LaptopRepository  laptopRepository;

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/student")
    public String getStudent(@RequestParam String id, Model model) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student != null) {
            model.addAttribute("student", student);
        }
        return "student";
    }
    
//    @GetMapping("/laptop")
//    public String getModel(@RequestParam long id,Model model)
//    {
//    	Laptop laptop=laptopRepository.findById(id).orElse(null);
//    	if (laptop != null) {
//            model.addAttribute("laptop", laptop);
//        }
//    	return "laptop";
//    }
}
