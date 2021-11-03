package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TestController {
	@Value("${emp_name}")
	private String firstName;
	
		
    @RequestMapping(value ="/api/**",method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget index() {
        return new Widget(${emp_name}, 10, 7);
    }
    
    
    @RequestMapping(value ="/aclauncher",method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    public Widget index1() {
        return new Widget("Mugilan", 100, 70);
    }
    
    
}
