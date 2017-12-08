package com.test.tset;
import java.util.Scanner;
public class Pay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int RATE=5000; 
		int pay; 
		int hours; 
		Scanner input=new Scanner(System.in); 
		
		System.out.println("시간을 입력하시오:"); 
		hours=input.nextInt(); 
		
		if (hours>8){
			pay=RATE*8+(int)(1.5*RATE*(hours-8));
			else {
				pay=RATE*hours;
			System.out.println("임금은%d입니다.\n,pay");
			}
		}
	}

}
