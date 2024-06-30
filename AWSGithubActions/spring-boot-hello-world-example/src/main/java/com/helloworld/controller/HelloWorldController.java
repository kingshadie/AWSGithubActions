package com.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hellew() 
{
return "<h1> Congratulations. You have successfully deployed the sample Spring Boot Application. </h1>";
}
}
