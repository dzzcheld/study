package com.test.array;
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class ArrayTest02 {//클래스명과 파일명은 동일해야된다
	public static void main(String[] args) {
String[] idArray=new String[100];
String[] pwdArray=new String[100];

idArray[0]=pwdArray[0]="mimi";
idArray[2]=pwdArray[2]="mama";
idArray[3]=pwdArray[3]="mumu";

String inputID="";
String unputPWD="";  //사용자가 입력하는 아이디와ㅣ 패스워드
int currentIndex=0;

Scanner scan=new Scanner(System.in); 
		while(ture){     //무한루프 무조건 반복하는 것임.
		System.out.println("***도서 관리 프로그램***");
		System.out.println("[1]로그인");
		System.out.println("[2]회원가입");
		System.out.println("[3]아이디/패스워드찾기");
		System.out.println("[4]종료");
		System.out.println("메뉴를 선택하세요._");
		
		String menu=scan.nextLine();
		String msg=""; 
		switch (menu){
		case "1": 
			
			System.out.println("로그인 선택하셧습니다."); 
			System.out.println("아이디:");
			inputID=scan.nextLine(); 
			int findIndex=-1;
			for(int index=0; index<currenrtIndex;index++){
			if(inputId.equals(idArray[index])){
				findIndex=index;
				break;
			}
			}
			}
		if(findIndex>-1)
		System.out.print("패스워드:");
		inputPWD=scan.nextLine(); 
		if(inputPWD.equals(pwdArray[findindex])){
			System.out.println("로그인에 성공하셨습니다.\n");
		}else{//패스워드 불일치
			System.out.println("패스워드가 일치하지 않습니다.");
		}
		else{//존재하지 읺는 아이디 
			System.out.println("아이디가 존재하지 않습니다.");
		} //for문을 지나면 아이디 존재여부는 판단가능함,이 조건은 가입할때 중복체크를 하면된다.
			break; 
		case "2":
			System.out.println("회원가입을 선택하셨습니다.\n"); 
			
			System.out.print("아이디: "); 
			inputId=scan.nextLine(); 
			
			if(currentIndex>=idArray.length){
			  String[] temp=new String[idArray.length+20]; //20개 버퍼링을 하는것임
			  for(int i=0; i<idArray.length; i++){
				  temp[i]=idArray[i];//idarray를 temparray로 넘기는 과정이다 ->>.새로운 array를 했으니 가입절차를 밟는게 가능하다
			  } 
			  idArray=temp;//array copy를 외울필요없ㅇ; for문을 씀녀ㅑ됨
			}
			  
			boolean exsistID=false;
			
			  for(int i=0; i<idArray.length;i++){
				  if(inputID.equals(idArray[i])){
				 exsistID=true;
				  }
				  }
			  if(!exsistID){
				  System.out.println("패스워드:"); 
				  inputPWD=scan.nextLine(); 
				  idArray[currentIndex]=inputID; 
				  pwdArray[currentIndex]=inputPwd;
				  currentIndex++;  
				  System.out.println("중복된 아이디 입니다.");
			  }else{
				  System.out.println("중복된 아이디 입니다.");
			break;
	}
		case "3":
			msg="아이디/패스워드 찾기를 선택하셨습니다.";
			break;
		case "4":
			msg="프로그램을 종료합니다..";
			return;
			default:
			
			msg="메뉴 선택이 올바르지 않습니다.";
			System.out.println(msg);
		} //switch문 블럭 마지막
	} //무한루프 while문의 마지막
				
             				} //main메소드 블럭
			} //클래스 블럭

