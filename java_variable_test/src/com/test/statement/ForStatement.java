package com.test.statement;

import java.util.Scanner;

public class ForStatement {

	public static void main(String[] args) {
int sum=0;
int sumPlus=0;
		for(int i=1; i<11; i++){//�ʱⰪ�� ó������ �۵����ϰ� �ε�ȣ�� �����̵Ǹ� �ݺ��� �����
sum+=i; sumPlus+=sum; //sum�� ���� �������ִ� ������ �Ѵ�.
	}
System.out.println(sum);

Scanner scan=new Scanner(System.in);
while(!scan.nextLine().equals("y")) {
	System.out.println("y�� ������ ������ �ݺ��մϴ�.");
}
}
}