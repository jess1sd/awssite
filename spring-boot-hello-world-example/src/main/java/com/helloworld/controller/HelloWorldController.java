package com.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "<h1> Congratulations WV MOM 1 ! </h1>" +
        "<p>You have successfully deployed the sample Spring Boot Application. </p>";
}
}
