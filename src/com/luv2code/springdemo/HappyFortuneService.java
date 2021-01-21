package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService{
 public String getFortune(){
     final String s = "Today is your lucky day!";
     return s;
 }
}
