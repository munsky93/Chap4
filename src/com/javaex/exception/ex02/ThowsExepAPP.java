package com.javaex.exception.ex02;

import java.io.IOException;

public class ThowsExepAPP {

	public static void main(String[] args) throws IOException {


		ThrowsExep exep = new ThrowsExep();
		exep.executeExcept();
	
		
		
		
	/*	
		try {
			exep.executeExcept();
 	    } catch (IOException e) {
 	    	System.out.println(e);
 	    	System.out.println("파일을 생성합니다.");
 	    }*/
	}

}
