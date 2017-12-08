package com.test.array;

import java.util.Scanner;

public class ArrayTet03 {

	public static void main(String[] args) {
		// 학생 3명의 이름과 국.영.수 점수를 입력받아 각각의 학생의 평균을 출력하는 프로그램을 작성하시오
		/*
		 * 1번 학생
		 * 이름:kim
		 * 국어:65
		 * 영어:45
		 * 수학:56
		 * 1의 평균 59*/ 
		
		String[][] studentArray=new String[3][4]; //3행(row) 4열
		Scanner scan=new Scanner(System.in);
		//입력
		for(int num=1; num<studentArray.length+1; num++){
			System.out.println("1번 학생");
			System.out.print("이름: ");
			studentArray[num][0]=scan.nextLine(); //[]는 인덱스 표시
			System.out.print("국어: "); 
			studentArray[num][1]=scan.nextLine();
			System.out.print("영어: ");
			studentArray[num][2]=scan.nextLine();
			System.out.print("수학: ");
			studentArray[num][3]=scan.nextLine();
		}

		//출력 입출력 동시에 불가
		int total=0;
		for(int num=1; num<studentArray.length+1;num++){ //평균값을 내기위한 출력
			         total=Integer.parseInt(studentArray[num-1][1])
					+total=Integer.parseInt(studentArray[num-1][2])
					+total=Integer.parseInt(studentArray[num-1][3]); 
			System.out.println(num+"번 "+studentArray[num-1][0]
					+"평균: "+(total*1f/(studentArray[num].length-1))
					);
		}
	}

}
