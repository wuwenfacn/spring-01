package com.fa.spring.controller;

import com.fa.spring.service.UserService;
import com.fa.spring.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
/*控制层注解*/
@Controller
public class UserController {

    /*创建对象交给spring容器创建*/
    @Autowired
    UserService userService;

}
