package com.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class BusinessLogic {
    @Value("${n1}")
    private int a;
    @Value("${n2}")
    private int b;

public void ser(){
    System.out.println("From Service");
}

public void sub(){
    System.out.println("substraction is "+ (a-b));
}
}

