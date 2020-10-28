package com.fa.spring.bean;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

/*自动为属性添加get、set等方法*/
@Data
/*注解在类上，可以作用在任何层次。*/
@Component
public class User {
    private Integer id;
    private String username;
    private String password;
    @Autowired
    private Student student;

    public void init(){
        System.out.println("初始化对象");
    }

    public void destroy(){
        System.out.println("销毁对象");
    }

    /*public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }*/
}
