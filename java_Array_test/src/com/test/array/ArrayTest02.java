package com.test.array;
import java.io.InputStream;
import java.util.Scanner;
import java.util.*;
public class ArrayTest02 {//Ŭ������� ���ϸ��� �����ؾߵȴ�
	public static void main(String[] args) {
String[] idArray=new String[100];
String[] pwdArray=new String[100];

idArray[0]=pwdArray[0]="mimi";
idArray[2]=pwdArray[2]="mama";
idArray[3]=pwdArray[3]="mumu";

String inputID="";
String unputPWD="";  //����ڰ� �Է��ϴ� ���̵�ͤ� �н�����
int currentIndex=0;

Scanner scan=new Scanner(System.in); 
		while(ture){     //���ѷ��� ������ �ݺ��ϴ� ����.
		System.out.println("***���� ���� ���α׷�***");
		System.out.println("[1]�α���");
		System.out.println("[2]ȸ������");
		System.out.println("[3]���̵�/�н�����ã��");
		System.out.println("[4]����");
		System.out.println("�޴��� �����ϼ���._");
		
		String menu=scan.nextLine();
		String msg=""; 
		switch (menu){
		case "1": 
			
			System.out.println("�α��� �����ϼ˽��ϴ�."); 
			System.out.println("���̵�:");
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
		System.out.print("�н�����:");
		inputPWD=scan.nextLine(); 
		if(inputPWD.equals(pwdArray[findindex])){
			System.out.println("�α��ο� �����ϼ̽��ϴ�.\n");
		}else{//�н����� ����ġ
			System.out.println("�н����尡 ��ġ���� �ʽ��ϴ�.");
		}
		else{//�������� �ݴ� ���̵� 
			System.out.println("���̵� �������� �ʽ��ϴ�.");
		} //for���� ������ ���̵� ���翩�δ� �Ǵܰ�����,�� ������ �����Ҷ� �ߺ�üũ�� �ϸ�ȴ�.
			break; 
		case "2":
			System.out.println("ȸ�������� �����ϼ̽��ϴ�.\n"); 
			
			System.out.print("���̵�: "); 
			inputId=scan.nextLine(); 
			
			if(currentIndex>=idArray.length){
			  String[] temp=new String[idArray.length+20]; //20�� ���۸��� �ϴ°���
			  for(int i=0; i<idArray.length; i++){
				  temp[i]=idArray[i];//idarray�� temparray�� �ѱ�� �����̴� ->>.���ο� array�� ������ ���������� ��°� �����ϴ�
			  } 
			  idArray=temp;//array copy�� �ܿ��ʿ����; for���� �������
			}
			  
			boolean exsistID=false;
			
			  for(int i=0; i<idArray.length;i++){
				  if(inputID.equals(idArray[i])){
				 exsistID=true;
				  }
				  }
			  if(!exsistID){
				  System.out.println("�н�����:"); 
				  inputPWD=scan.nextLine(); 
				  idArray[currentIndex]=inputID; 
				  pwdArray[currentIndex]=inputPwd;
				  currentIndex++;  
				  System.out.println("�ߺ��� ���̵� �Դϴ�.");
			  }else{
				  System.out.println("�ߺ��� ���̵� �Դϴ�.");
			break;
	}
		case "3":
			msg="���̵�/�н����� ã�⸦ �����ϼ̽��ϴ�.";
			break;
		case "4":
			msg="���α׷��� �����մϴ�..";
			return;
			default:
			
			msg="�޴� ������ �ùٸ��� �ʽ��ϴ�.";
			System.out.println(msg);
		} //switch�� �� ������
	} //���ѷ��� while���� ������
				
             				} //main�޼ҵ� ��
			} //Ŭ���� ��

