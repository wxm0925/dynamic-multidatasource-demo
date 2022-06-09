package demo.test.controller;

import demo.test.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wenxiangmin
 * @ClassName StudentController.java
 * @Description TODO
 * @createTime 2022年06月08日 22:08:00
 */
@RestController
@RequestMapping("student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @GetMapping("{stuId}")
    public Object getStudent(@PathVariable(value = "stuId") Long stuId) {
        return studentService.getStudent(stuId);
    }
}
