package com.test.array;
import java.Scanner.*;
import java.util.Arrays;
public class Lotto {

	public static void main(String[] args) {
		
		System.out.println("����� ��Ʈ ���� �Է��Ͻÿ�.");
		int setNum=Integer.parseInt(new Scanner(System.in)).nexLine();
		
		int (int k=0; k<setNum; k++){
		
		int[] lottoNum=new int[45]; //index=array.length-1
									//45���� ���� �ʱ�ȭ
		
		for(int i=0; i<lottoNum.length;i++){
			lottoNum[i]=i+1; //+1�� ������ 0���� ���� �����̴�(index�� 0���� �����Ѵ�
		}

		for(int i=0; i<lottoNum.length*2; i++){ //�������ؼ� �ι�� �Ҹ�
			
		}
		
		int tempNum=0; 
		int changeIndex=0; 
		
		for(int i=0; i<lottoNum.length*2; i++){
			changeIndex=(int)(Math.random()*lottoNum.length); //������ ������ changeIndex�� ������ ������
			tempNum=lottoNum[changeIndex]; //tempNum�� ����
			lottoNum[changeIndex]=lottoNum[0]; 
			lottoNum[0]=tempNum;
			}//3��° for��
		
		
		int[] output=new int[6];
		for(int i=0; i<6; i++){  //���ڸ� ��°��� ���⼭ �����۾��� �ؾߵȴ� 
			output[i]=lottoNum[i]; 
		} //4°for�� 
        Arrays.sort(output);		
		}
		
		} //�޼ҵ�
	} //Ŭ����


