package com.test.tset;
import java.util.Scanner;
public class IsHangleOk {

	public static void main(String[] args) {
		/*int �ε���=0; 
		�ε���++; 
		System.out.println(�ε���);*/ 
		
		/*int n=0; 
		if(n>=100){
			System.out.println("large");
		}
		else{
			System.out.println("small");
		} */
	
	Scanner scan=new Scanner(System.in);
	System.out.println("�� ����� �Է��Ͻÿ�.");
	int size=Integer.parseInt(scan.nextLine());
	
	
	if(size<100){
		System.out.println("small");
	}else if(size<200){
		
		System.out.println("medium");
	}
	
	
	
	
	
	}
	

}
