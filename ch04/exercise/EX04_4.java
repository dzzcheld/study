package com.test.exercise;

public class EX04_4 {

	public static void main(String[] args) {
		//1+(-2)+3+(-4)...����� ���ؾ� ������ 100 �̻��ΰ�/¦���� �����
//while(����){����ϰ� ������}
 int num=0; 
 int sum=0;
 while(sum<100){
	 num++;
	 if(num%2==0){
		 sum-=num;
		 }else{sum+=num; 
 }
	}
System.out.println("num="+num);
System.out.println("sum="+sum);
	
	 
			
	}}

