package com.test.exercise;

public class EX04_1 {

	public static void main(String[] args) {
		//4-1 1.
		int x=11; 
		System.out.println(x>10 && x<20);
		//4-1 2.
		char ch='A'; 
		System.out.println(!(ch !== ' '||ch !== '\t'));
		//4-1 3.
		System.out.println(ch=='x' || ch=='X');
		//4-1 4. 
		System.out.println(ch>'0' && ch<= '9');
		//4-1 5. 
		System.out.println(
		(ch=>'a' && ch<='z') || (ch>='A' && ch<='Z'));
		//4-1 6.
		int year=2000; 
		System.out.println(((year%400)==0) ||((year%4)==0 && (year%100)!=0));
		//4-1 7.
		boolean poewrOn=false; 
		System.out.println(!powerOn); 
		
		//1���� 20������ ���� �߿��� 2�Ǵ� 3�� ����� �ƴ� ���� ������ ���Ͻÿ�
		int sum=0; 
		for(int num=1; num<21; num++){
			if(num%2!=0 && num%3!=0){sum+=num;}
			System.out.println();
		}
	}

}
