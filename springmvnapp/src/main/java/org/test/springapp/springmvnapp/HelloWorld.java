package org.test.springapp.springmvnapp;

public class HelloWorld {
	
	public HelloWorld() {}
	
	private String message;

	public void getMessage() {
		System.out.println("My Maven Input Message is "+message);
	}

	public void setMessage(String message) {
		this.message = message;
	}	
}
