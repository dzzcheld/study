package com.test.variable;

public class OperatorTest {

	public static void main(String[] args) {
		//���׿����� 
		int i=0; 
		i=i+1; //++i(���� �����̰� ���� i++(���� �����Ŀ� ������
		System.out.println("i+1="+1);
		
		
		char ch='A'; 
		ch=65;
		
		
		//���������
		int x=10,y=2; //����
		int sum=x+y; //���� ���ϱ�
		int sub=x-y; //���� ����
		int multi=x*y; //���� ��
		float div=x/(y*1.0f); //������ �Ǽ� ���
		int mock=x/y; //���� ��
		int nameoji=x%y; //���� ������
		int chSumInt=ch+3; 
		char chSumInt2=(char)chSumint; 
		System.out.println("x+y="+sum);
		System.out.println("x-y="+sub);
		System.out.println("x*y="+multi);
		System.out.println("x/y"=+div);
		System.out.println("��x/y=+mock");
		System.out.println("������x%y=+nameoji");
		System.out.println("")
//1234.56789  �Ҽ��� ��°�ڸ����� �ݿø�    int���ϸ� �Ҽ��� �Ʒ��� ������ ����1
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
int kor=92; System.out.println("�������� ����;"+((kor>90)?"A":"F");
	
	//�������� 
int k=9; 
int l=10; 
System.out.println(k>9&&(l=11)>10); 

//���Կ�����
int m=0; 
m=m+1; //m+=1; ����������
System.out.println("m=m+1:"+m); 
	
	
	
	
	}
}
