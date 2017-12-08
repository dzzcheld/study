package com.test.exercise;

public class EX04_4 {

	public static void main(String[] args) {
		//1+(-2)+3+(-4)...몇까지 더해야 총합이 100 이상인가/짝수는 빼기다
//while(조건){출력하고 싶은것}
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

