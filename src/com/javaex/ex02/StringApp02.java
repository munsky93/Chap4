package com.javaex.ex02;

public class StringApp02 {

	public static void main(String[] args) {
	
		
		String a = new String(" abcd");  //�տ� ����
		String b = new String(",efg ");  //�ڿ� ���� 
		
		
		/*String r01 = a.concat(b);
		System.out.println(r01); */      //���� ������ �����ִ� ���
		
		
		a = a.concat(b);
		System.out.println(a);
		
		
		a = a.trim();
		System.out.println("---"+a+"---");   //������ֱ�
		
		
		a = a.replace("ab", "12" );       //ab�� ���ڷ� �ٲ��ֱ�
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
