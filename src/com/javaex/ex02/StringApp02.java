package com.javaex.ex02;

public class StringApp02 {

	public static void main(String[] args) {
	
		
		String a = new String(" abcd");  //앞에 공백
		String b = new String(",efg ");  //뒤에 공백 
		
		
		/*String r01 = a.concat(b);
		System.out.println(r01); */      //위에 공백을 붙쳐주는 기능
		
		
		a = a.concat(b);
		System.out.println(a);
		
		
		a = a.trim();
		System.out.println("---"+a+"---");   //공백없애기
		
		
		a = a.replace("ab", "12" );       //ab를 숫자로 바꿔주기
		System.out.println(a);
		System.out.println("====================");
	
		
	    String[] s = a.split(",");
          for(int i=0; i<s.length; i++) {
    	     System.out.println(s[i]);
    	     
    	
    	String str = "Hello java!";
    	
    	String r01 = str.substring(3);   
    	System.out.println(r01);
    }
	}

}
