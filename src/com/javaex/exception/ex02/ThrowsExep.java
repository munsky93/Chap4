package com.javaex.exception.ex02;

import java.io.IOException;  //import ����!!!!!!

public class ThrowsExep {

	public void executeExcept() throws IOException {
		System.out.println("�������ܹ߻�");
	    throw new IOException();     //������ ���� �߻�
	    
	
	    
	  /*  try { 
	    	System.out.println("�������ܹ߻�");
	    	throw new IOException();
	    }cathch(IOException e) {
	    	System.out.println("������ �����ϴ�.");
	    }*/
	}

}
