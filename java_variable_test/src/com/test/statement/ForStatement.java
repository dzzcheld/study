package com.test.statement;

import java.util.Scanner;

public class ForStatement {

	public static void main(String[] args) {
int sum=0;
int sumPlus=0;
		for(int i=1; i<11; i++){//초기값은 처음에만 작동을하고 부등호는 거짓이되면 반복을 멈춘다
sum+=i; sumPlus+=sum; //sum의 값을 누적해주는 역할을 한다.
	}
System.out.println(sum);

Scanner scan=new Scanner(System.in);
while(!scan.nextLine().equals("y")) {
	System.out.println("y를 누르기 전까지 반복합니다.");
}
}
}