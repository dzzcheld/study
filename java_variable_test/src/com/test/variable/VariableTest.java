package com.test.variable;

import java.util.Scanner;

public class VariableTest{ 

	public static void main(String[] args)
	{Scanner scan=new Scanner(System.in);//�ֿܼ��� �����°��� �ݴ�� out�̴�
		int kor=90; int eng=80; int math=100; 
		System.out.print("��������:");   //���ʰ� ������ ���°� �ٸ��� ���ʱ����̱⿡ �������� Ʋ���ٰ� ����
		kor=Integer.parseInt(scan.nextLine()); //�׷��� �����ʰ��� Integer������ ��ȯ�ؾߵ� ���ڸ� �־�ߵ�
		System.out.print("��������:");          //print������ �ϸ� ln���´ٸ��� �ٷο��� ������� ����
		eng=Integer.parseInt(scan.nextLine());
		System.out.print("��������:");
		math=Integer.parseInt(scan.nextLine());
		//������ ���ڿ��� �������Ѵ�
		
		int total=kor+eng+math; 
		float avg=total/3; 
		 
		//���� 2�ؼ�
		char grade=(avg>=90)? 'A':(
				   (avg>=80)? 'B':'F');   //������-�ؽ�Ʈ ������ �ð�ȭ
		System.out.println("����:"+grade);
		//if����(����) �̿��ؼ� ����2�� Ǯ��� 
		String gradeIf="";//�����̽� �ѹ����ص� �ʱ�ȭ�� �̷�����('�϶�)
if(avg>=90)
{grade="A"; if(avg>=95)
{gradeIf=gradeIf+"+";}}//���ڿ��� �״�� ���̴°Ŵ� 
else{if(avg>=80){gradeIf=gradeIf+"+";
if(avg<90 && avg>=80)
{grade="B";}
else{grade="F";}  //������ ������Ű�� ���Ҷ����� �ڷγѾ�� if���� �ڵ带 ���������� �ٲ��ش�
System.out.println("����:"+grade);
		
		
//���� 1�ؼ�                
//�ݿø��� �ٻ簪-->>����� �ڸ��� �Ѵܰ� �̵��ϴ� ���̴�. 
float roundNum=1234.56789f; 
roundNum+=0.005f;
roundNum=(int)(roundNum*100f); //������ �ս��� ���⿡ ��ȯ�ص� ������
roundNum/=100f; 
//roundNum((int)((ruondNum+0.005f)*100f))/100f; ������
System.out.println("��°�ڸ� �ݿø�:"+roundNum);
}


