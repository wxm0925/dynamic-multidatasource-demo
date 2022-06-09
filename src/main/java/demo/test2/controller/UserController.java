package demo.test2.controller;

import demo.test2.service.UserService;
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
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("{id}")
    public Object getStudent(@PathVariable(value = "id") Long id) {
        return userService.getUserById(id);
    }
}
