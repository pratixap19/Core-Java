package com.exception;

public class HandleCheckedException {

	public static void main(String[] args) throws InterruptedException {

    System.out.println("Program is started");
    System.out.println("Program is in progress");
    
    /*try {
    	Thread.sleep(2000);
    }
    catch(InterruptedException e) {
    	System.out.println(e.getMessage());
    	
    }*/
    
    Thread.sleep(4000);
    
    System.out.println("Program is completed");
    System.out.println("Program is exited");

	}

}
