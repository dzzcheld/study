package com.stirng.test;

public class StringTest {

	public static void main(String[] args) {
		
		String msg="�ݰ����ϴ�."; 
		System.out.println(msg);
		System.out.println("���ڿ�����:"+msg.length());
		System.out.println("���ڿ� ��:"+msg.equals("�ٹٹ�"));
		
		//Ŭ�������� �迭�� �����ִ� Ű������ String�̰� referenceŸ���̴�
        System.out.println("����Ž��:"+msg.contains("�ݰ�"));
        System.out.println("��� �ε��� ��ȯ:"+msg.indexOf("�ϴ�"));
        System.out.println("index�� ���� ��ȯ:"+msg.charAt(2)); 
        System.out.println("���ڿ� Ȯ��:"+msg.isEmpty()); 
        System.out.println("���ڿ� ��ü:"+msg.replace("�ݰ���","������")); 
        System.out.println("���ڿ� �߶󳻱�:"+msg.substring(0,3));
        //w\���������� �ٲٴ°��� �ƴ϶� ���ϸ� �ϴ°Ŵ� 
        System.out.println("�빮�� ��ȯ:"+msg.toUpperCase());
        System.out.println("�ҹ��� ��ȯ:"+msg.toLowerCase()); 
        //������ �����ͺ��̽����� ��� �빮�ڷ� ����ȴ�.��, �н������ ���ܴ� 
	
	for(int index=0; index<msg.length(); index++){
	System.out.println(msg.charAt(index));
	char ch=msg.charAt(index); 
	boolean isNumber=false; //is�� ~~�̴� ~~�̳� ��� �ǹ̸� ���´� flag�� �Ҹ�Ÿ���ε� ��ȣ��� ���� �����
	if(!(ch>=48 && ch<=57)); {
		isNumber=false; 
	                                           }
	//���׿����� ��Ʈ ���ϴ� ��� ��Ʈ�� �ٲ۴� askii�ڵ� ������ �񱳸��Ѵ�
	}
	}
	System.out.println(isNumber?"����":"���ڰ� �ƴ�");
	
	
	} 
	
	
	

}
