package com.test.array;

import java.util.Scanner;

public class ArrayTet03 {

	public static void main(String[] args) {
		// �л� 3���� �̸��� ��.��.�� ������ �Է¹޾� ������ �л��� ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�
		/*
		 * 1�� �л�
		 * �̸�:kim
		 * ����:65
		 * ����:45
		 * ����:56
		 * 1�� ��� 59*/ 
		
		String[][] studentArray=new String[3][4]; //3��(row) 4��
		Scanner scan=new Scanner(System.in);
		//�Է�
		for(int num=1; num<studentArray.length+1; num++){
			System.out.println("1�� �л�");
			System.out.print("�̸�: ");
			studentArray[num][0]=scan.nextLine(); //[]�� �ε��� ǥ��
			System.out.print("����: "); 
			studentArray[num][1]=scan.nextLine();
			System.out.print("����: ");
			studentArray[num][2]=scan.nextLine();
			System.out.print("����: ");
			studentArray[num][3]=scan.nextLine();
		}

		//��� ����� ���ÿ� �Ұ�
		int total=0;
		for(int num=1; num<studentArray.length+1;num++){ //��հ��� �������� ���
			         total=Integer.parseInt(studentArray[num-1][1])
					+total=Integer.parseInt(studentArray[num-1][2])
					+total=Integer.parseInt(studentArray[num-1][3]); 
			System.out.println(num+"�� "+studentArray[num-1][0]
					+"���: "+(total*1f/(studentArray[num].length-1))
					);
		}
	}

}
