package com.test.statement;

import java.util.Scanner;

public class StatementTest {

	public static void main(String[] args) {
		int kor; 
		int eng; 
		int math; 
		
		Scanner scan=new Scanner(System.in); 
		
		System.out.println("국어:");
		kor=Integer.parseInt(scan.nextLine());
		System.out.println("영어:");
		kor=Integer.parseInt(scan.nextLine());
		System.out.println("수학:");
		kor=Integer.parse
				Int(scan.nextLine()); 
		 
		float avg=(kor+eng+math)/3f;
		
		switch ((int) (avg/10)) {
		case 10:case 9:
			grade="A"; 
			break;
		case 8:
			grade="B"; 
			break;
		case 7:
			grade="C"; 
			break; 
		case 6:
			grade="D"; 
			break;
			default:
				grade="F";
			
			
			
		}
		
	}

}
