package com.javaex.ex03;

public class WrapperApp {

	public static void main(String[] args) {
		
		
		Integer i = new Integer(10);
		Short s = new Short((short)3);   //short�� ���θ� ����� ������ ���� ����!!
		Byte b = new Byte((byte)3);      //byte�� �� ���θ� ����� ������ ���� ����!!
		
		
		
		//���� �ؿ� ����� ���� ������ ���� ���� ����� ��!! 
		Integer result = new Integer(10) + new Integer(3);
		System.out.println(result);
		
	    Integer i01 = 10;
	    
	     int r02 = i01.parseInt("1234");    //parseInt ���ڸ� ���ڷ� �ٲٴ� ���
	     System.out.println(r02);           //���ڿ� -> ������ 
	 
	     //������ ���ڿ��� 
    	 String str = String.valueOf(555);
    	 System.out.println(str);
    	 
    	 String str2 = "" + 666;
    	 System.out.println(str2);
    	 
    	 
    	 String s04 = "hi";
    	 String inputText = "hi";
    	 if(inputText.equals(s04)) {     //inputText�� "hi"�� ����!! 
    		 
    	 }

 	}

}
