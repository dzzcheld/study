package com.test.variable;

public class ���� {

	public static void main(String[] args) {//1234.57
		//q1 1234.56789 �Ҽ��� ��°�ڸ����� �ݿø� �� 
		float a=1234.56789f; 
		a=(a+0.005f);  //�ݿø�  1234.57289
		a=(int)(a*100); //��Ʈ���·� �ٲ㼭 �Ҽ��� ������  123457.89 
		a=a/100f; //�ٽ� ���Ѹ�ŭ ������ 1234.57
		System.out.println(a);

		//q2.      ����� 90�̻� A          80�̻�B           80�̸�F
		int kor=90; int eng=80; int math=100; //�������� 
		int total=kor+eng+math;//�� 
		float avg=total/3; //���
		System.out.println("����:"+total);
		System.out.println("���:"+avg);  
		
		System.out.println("���"+((avg>=90) ? "A": (avg>=80) ? "B" : "F")); 
		//������-�ؽ�Ʈ ������ �ð�ȭ
		
			//System.out.println("���:"+((kor>=90?"A":"F")));
			
		//���� 
		//(���ǽ�) ? A(true):B(false) 
		// int kor=92; �ڷ����� kor�������� 
		//System.out.println("�������� ����:"+((kor>=90?"A" :"F")) for�� 90���� ũ�ų� ������ A �ƴϸ�F
		
		//����3 �ԷµǴ� ���� ������ �����ϸ� 0~100������ ������ ����; 
		//'����Ͻðڽ��ϴ�?(y/n)' �޼����� ����ϰ� 'n'�϶����� �ݺ�.
		
		//12�� 1�� 
		
		
		
		
		
		
		
		
		
		
		
		
			}

		

	}


