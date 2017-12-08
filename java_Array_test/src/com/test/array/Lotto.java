package com.test.array;
import java.Scanner.*;
import java.util.Arrays;
public class Lotto {

	public static void main(String[] args) {
		
		System.out.println("출력할 세트 수를 입력하시오.");
		int setNum=Integer.parseInt(new Scanner(System.in)).nexLine();
		
		int (int k=0; k<setNum; k++){
		
		int[] lottoNum=new int[45]; //index=array.length-1
									//45개의 정수 초기화
		
		for(int i=0; i<lottoNum.length;i++){
			lottoNum[i]=i+1; //+1이 잆으면 0부터 들어가기 때문이다(index는 0부터 시작한다
		}

		for(int i=0; i<lottoNum.length*2; i++){ //섞기위해서 두배로 불림
			
		}
		
		int tempNum=0; 
		int changeIndex=0; 
		
		for(int i=0; i<lottoNum.length*2; i++){
			changeIndex=(int)(Math.random()*lottoNum.length); //위에서 정의한 changeIndex를 난수로 지정함
			tempNum=lottoNum[changeIndex]; //tempNum은 난수
			lottoNum[changeIndex]=lottoNum[0]; 
			lottoNum[0]=tempNum;
			}//3번째 for문
		
		
		int[] output=new int[6];
		for(int i=0; i<6; i++){  //숫자를 찍는곳인 여기서 정렬작업을 해야된다 
			output[i]=lottoNum[i]; 
		} //4째for문 
        Arrays.sort(output);		
		}
		
		} //메소드
	} //클래스


