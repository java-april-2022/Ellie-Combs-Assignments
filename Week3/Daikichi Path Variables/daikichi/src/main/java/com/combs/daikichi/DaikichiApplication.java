package com.combs.daikichi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
 
public class DaikichiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DaikichiApplication.class, args);
	}
    @RequestMapping("/")
    public String hello() {
            return "Hello there!";
    }
    
    @RequestMapping("/today")
    public String today() {
            return "Today will be lucky!";
    }
    
    @RequestMapping("/tomorrow")
    public String tomorrow() {
    	return "There's always tomorrow.";
    }
    
    @RequestMapping("/travel/{town}")
    public String travel(@PathVariable String town) {
		return "Congratulations! You will soon travel to " +town;
    }
    
    @RequestMapping("/lotto/{number}")
    public String lotto(@PathVariable int number) {
    	if (number % 2 == 0) {
    		return "You will take a grand journey in the near future, enjoy every minute.";	
    	}
    	else 
    		return "You have enjoyed the fruits of your labor but now is a great time to spend time with yourself.";
    		
    }
    
}
