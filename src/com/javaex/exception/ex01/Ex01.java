package com.javaex.exception.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		
		double result;
		int num;
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		try { 
			result = 100/num;  //java.lang.ArithmeticException �߻�
		    System.out.println(result);
		} catch (ArithmeticException e) {     //catch ���⸸ ��ƶ� 
			System.out.println(e);              
		} finally {
			System.out.println("finally ����");
		}
		
		sc.close();
	}

}
