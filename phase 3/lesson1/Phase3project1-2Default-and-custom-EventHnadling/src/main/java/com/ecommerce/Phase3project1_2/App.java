package com.ecommerce.Phase3project1_2;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ecommerce.custom.CustomEventPublisher;

public class App {
	public static void main(String[] args) {

		//default event handling
		
    	ConfigurableApplicationContext context1= new ClassPathXmlApplicationContext("main-servlet.xml");
    	context1.start();
    	context1.stop();
    	
    	
    	//custom event handling
    	
    	CustomEventPublisher cep=(CustomEventPublisher)context1.getBean("cep");
    	cep.publish();
    	
	}
}