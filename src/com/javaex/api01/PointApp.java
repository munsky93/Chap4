package com.javaex.api01;

public class PointApp {

	public static void main(String[] args) {
		
		Point a = new Point(2, 3);
		Point b = new Point(2, 3);
		Point c = a;
		
		System.out.println(a == b);
        System.out.println(a.equals(b));		
		
		
		
		
		
		
		
		
		
		/*System.out.println(a == b);
        System.out.println(a == c);*/
        
       
        /*Point a = new Point(2,3);
		
		System.out.println(a.hashCode());
		System.out.println(a.getClass());
		System.out.println(a.getClass().getName());
		System.out.println(a.toString());
		System.out.println(a);*/
	}

}
