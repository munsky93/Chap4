package com.javaex.exception.ex02;

import java.io.IOException;  //import 주자!!!!!!

public class ThrowsExep {

	public void executeExcept() throws IOException {
		System.out.println("강제예외발생");
	    throw new IOException();     //강제로 예외 발생
	    
	
	    
	  /*  try { 
	    	System.out.println("강제예외발생");
	    	throw new IOException();
	    }cathch(IOException e) {
	    	System.out.println("파일이 없습니다.");
	    }*/
	}

}
