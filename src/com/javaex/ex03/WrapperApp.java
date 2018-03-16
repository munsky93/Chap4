package com.javaex.ex03;

public class WrapperApp {

	public static void main(String[] args) {
		
		
		Integer i = new Integer(10);
		Short s = new Short((short)3);   //short은 가로를 해줘야 오류가 나지 않음!!
		Byte b = new Byte((byte)3);      //byte또 한 가로를 해줘야 오류가 나지 않음!!
		
		
		
		//원래 밑에 방법이 맞음 하지만 힘들어서 위에 방법을 씀!! 
		Integer result = new Integer(10) + new Integer(3);
		System.out.println(result);
		
	    Integer i01 = 10;
	    
	     int r02 = i01.parseInt("1234");    //parseInt 문자를 숫자로 바꾸는 방법
	     System.out.println(r02);           //문자열 -> 정수로 
	 
	     //정수를 문자열로 
    	 String str = String.valueOf(555);
    	 System.out.println(str);
    	 
    	 String str2 = "" + 666;
    	 System.out.println(str2);
    	 
    	 
    	 String s04 = "hi";
    	 String inputText = "hi";
    	 if(inputText.equals(s04)) {     //inputText에 "hi"가 들어간다!! 
    		 
    	 }

 	}

}
