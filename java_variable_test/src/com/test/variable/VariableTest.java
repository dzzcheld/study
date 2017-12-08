package com.test.variable;

import java.util.Scanner;

public class VariableTest{ 

	public static void main(String[] args)
	{Scanner scan=new Scanner(System.in);//콘솔에서 들어오는것임 반대는 out이다
		int kor=90; int eng=80; int math=100; 
		System.out.print("국어점수:");   //왼쪽과 오른쪽 형태가 다른데 왼쪽기준이기에 오른쪽이 틀리다고 나옴
		kor=Integer.parseInt(scan.nextLine()); //그래서 오른쪽값을 Integer값으로 변환해야됨 숫자만 넣어야됨
		System.out.print("영어점수:");          //print문으로 하면 ln과는다르게 바로옆에 결과값이 나옴
		eng=Integer.parseInt(scan.nextLine());
		System.out.print("수학점수:");
		math=Integer.parseInt(scan.nextLine());
		//무조건 문자열로 전달을한다
		
		int total=kor+eng+math; 
		float avg=total/3; 
		 
		//퀴즈 2해설
		char grade=(avg>=90)? 'A':(
				   (avg>=80)? 'B':'F');   //레벨링-텍스트 최초의 시각화
		System.out.println("학점:"+grade);
		//if문을(단일) 이용해서 퀴즈2를 풀어보기 
		String gradeIf="";//스페이스 한번만해도 초기화가 이뤄진다('일때)
if(avg>=90)
{grade="A"; if(avg>=95)
{gradeIf=gradeIf+"+";}}//문자열은 그대로 붙이는거다 
else{if(avg>=80){gradeIf=gradeIf+"+";
if(avg<90 && avg>=80)
{grade="B";}
else{grade="F";}  //조건은 만족시키지 못할때마다 뒤로넘어간다 if문은 코드를 지능적으로 바꿔준다
System.out.println("학점:"+grade);
		
		
//퀴즈 1해설                
//반올림은 근사값-->>가까운 자리로 한단계 이동하는 것이다. 
float roundNum=1234.56789f; 
roundNum+=0.005f;
roundNum=(int)(roundNum*100f); //숫자의 손실이 없기에 변환해도 괜찮다
roundNum/=100f; 
//roundNum((int)((ruondNum+0.005f)*100f))/100f; 모범답안
System.out.println("세째자리 반올림:"+roundNum);
}


