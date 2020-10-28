package com.fa.spring.service.impl;

import com.fa.spring.service.UserService;
import org.springframework.stereotype.Service;

/*业务层注解*/
@Service
public class UserServiceImpl implements UserService {
    public void show(){
        System.out.println("我在这里");
    }
}
