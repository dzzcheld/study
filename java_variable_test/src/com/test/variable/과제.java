package com.test.variable;

public class 과제 {

	public static void main(String[] args) {//1234.57
		//q1 1234.56789 소수점 세째자리에서 반올림 ㄱ 
		float a=1234.56789f; 
		a=(a+0.005f);  //반올림  1234.57289
		a=(int)(a*100); //인트형태로 바꿔서 소수점 날리기  123457.89 
		a=a/100f; //다시 곱한만큼 나눈다 1234.57
		System.out.println(a);

		//q2.      평균이 90이상 A          80이상B           80미만F
		int kor=90; int eng=80; int math=100; //점수제시 
		int total=kor+eng+math;//총 
		float avg=total/3; //평균
		System.out.println("총점:"+total);
		System.out.println("평균:"+avg);  
		
		System.out.println("평균"+((avg>=90) ? "A": (avg>=80) ? "B" : "F")); 
		//레벨링-텍스트 최초의 시각화
		
			//System.out.println("평균:"+((kor>=90?"A":"F")));
			
		//삼항 
		//(조건식) ? A(true):B(false) 
		// int kor=92; 자료형에 kor변수선언 
		//System.out.println("국어점수 레벨:"+((kor>=90?"A" :"F")) for가 90보다 크거나 같으면 A 아니면F
		
		//퀴즈3 입력되는 값은 정수만 가능하며 0~100사이의 정수만 가능; 
		//'계속하시겠습니다?(y/n)' 메세지를 출력하고 'n'일때까지 반복.
		
		//12월 1일 
		
		
		
		
		
		
		
		
		
		
		
		
			}

		

	}


