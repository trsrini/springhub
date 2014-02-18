package org.test.springapp.springmvnapp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import org.test.springapp.springmvnapp.HelloWorld;

/**
 * Hello world!
 *
 */
public class SpringTestApp 
{
	public static void main(String[] args)   
	 { 
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-test-config.xml");
		HelloWorld hw = (HelloWorld) ctx.getBean("helloWorld");
		hw.getMessage();
	 }
}
