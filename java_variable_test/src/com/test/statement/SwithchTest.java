package com.test.statement;
import java.*;
public class SwithchTest {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		
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
			msg="�α��� �����ϼ˽��ϴ�."; 
			break; 
		case "2":
			msg="ȸ�������� �����ϼ̽��ϴ�.";
			break;
		case "3":
			msg="���̵�/�н����� ã�⸦ �����ϼ̽��ϴ�.";
			break;
		case "4":
			msg="���α׷��� �����մϴ�..";
			return;
			default:
			
			msg="�޴� ������ �ùٸ��� �ʽ��ϴ�.";
			System.out.println(msg);
		}

	}

}
