package com.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class PojoClass{
    @Value("Shravani Padma")
    private String name;
    @Value("vani@gmail.com")
    private String email;

    public void disp(){
        System.out.println("from Pojo");
    }
    public String toString(){
        return "from pojo "+name+" "+email;
    }

}
