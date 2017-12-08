package com.test.tset;
import java.util.Scanner;
public class IsHangleOk {

	public static void main(String[] args) {
		/*int 인덱스=0; 
		인덱스++; 
		System.out.println(인덱스);*/ 
		
		/*int n=0; 
		if(n>=100){
			System.out.println("large");
		}
		else{
			System.out.println("small");
		} */
	
	Scanner scan=new Scanner(System.in);
	System.out.println("컵 사이즈를 입력하시오.");
	int size=Integer.parseInt(scan.nextLine());
	
	
	if(size<100){
		System.out.println("small");
	}else if(size<200){
		
		System.out.println("medium");
	}
	
	
	
	
	
	}
	

}
