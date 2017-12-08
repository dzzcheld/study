package com.test.variable;

public class OperatorTest {

	public static void main(String[] args) {
		//단항연산자 
		int i=0; 
		i=i+1; //++i(먼저 움직이고 수행 i++(문장 실행후에 움직임
		System.out.println("i+1="+1);
		
		
		char ch='A'; 
		ch=65;
		
		
		//산술연산자
		int x=10,y=2; //정수
		int sum=x+y; //정수 더하기
		int sub=x-y; //정수 빼기
		int multi=x*y; //정수 곱
		float div=x/(y*1.0f); //정수와 실수 계산
		int mock=x/y; //정수 몫
		int nameoji=x%y; //정수 나머지
		int chSumInt=ch+3; 
		char chSumInt2=(char)chSumint; 
		System.out.println("x+y="+sum);
		System.out.println("x-y="+sub);
		System.out.println("x*y="+multi);
		System.out.println("x/y"=+div);
		System.out.println("몫x/y=+mock");
		System.out.println("나머지x%y=+nameoji");
		System.out.println("")
//1234.56789  소수점 세째자리에서 반올림    int로하면 소수점 아래는 버린다 퀴즈1
		//System.out.println
	

	//float x = 1234.56789f;
	//float y = 1 / 1000f;
	//float multi = x *
			//y
			System.out.println("x>y:"+(x>y));
			System.out.println("x>=y:"+(x>=y));
			System.out.println("x<y:"+(x<y));
			System.out.println("x<=y:"+(x<=y));
			System.out.println("x==y:"+(x==y));
			System.out.println("x!=y:"+(x!=y));
int kor=92; System.out.println("국어점수 레벨;"+((kor>90)?"A":"F");
	
	//논리연산자 
int k=9; 
int l=10; 
System.out.println(k>9&&(l=11)>10); 

//대입연산자
int m=0; 
m=m+1; //m+=1; 오류가많음
System.out.println("m=m+1:"+m); 
	
	
	
	
	}
}
