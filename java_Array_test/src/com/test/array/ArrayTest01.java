package com.test.array;

public class ArrayTest01 {

	public static void main(String[] args) { 
		{
			{
		
				{
					{
		
					}
				}
			}
		}
		//���������� block�ȿ����� ��ȿ�� ,ū������ �������� �Է��� �Ϸ����ϸ� �ߺ��� ���(�ٱ������ѹ� �ȿ����ѹ��϶� 
		//������ ���ԵǾ��ִ� ������ ����� ���¿��� ���������� �ߵ��Ǹ� ���������� ���簡 �߸��� ���̴� 
		//�������� ������ �� �������� �����ȴ�.������������ ���� ������ �Ŀ� ���������� ������ �ϸ� ������ ����. 
		//class�ʵ�� �޸� ������ �ٸ���(�ٸ� ����)
		//����Ҷ��� ���� ������ ������ �� �ֺ��� �������� Ž���ϰ� �� ������ ä���Ѵ�.
		// (������ ���������� ���� ���� ������ ���������� ���������� �������� ���Ѵ�.
		int[] intArray = new int[5]; // ����Ȯ��
		int[] intArray2 = { 1, 2, 3, 4, 5 }; // ����variable�ʱ�ȭ�� �Ҷ��� ������ ����̴�

		int[] intArray3 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // ���ο�
																		// �迭��
																		// �Ҵ��Ҷ�
																		// ���̴�
																		// �뵵��

		int[] intArray4 = new int[100]; // 0~99������ �ε����� �ִ�.
		for (int index = 0; index < intArray4.length; index++) {
			intArray4[index] = index + 1;// �ݺ����̱⿡ for���� �ʿ��ϴ�
			System.out.print(index);     //int index�� ���� �Ǿ������ �ߺ�ó������ ���̴�
		}

		for (int index = 0; index < intArray4.length; index++) {
			System.out.println(intArray4[index] + (intArray4[index] % 10 != 0 ? "," : "\n"));
		} // 10���� �������� �������� ������","�� ������ �������� "\n"�� ���ؼ� �ٹٲ��� �Ͼ��

		// 2���� �迭(��x��)-�迭 �ȿ� �迭
		int[][] intArrays = new int[3][3];

		int[][] intArrays2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};

		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		System.out.println(score);
		// row(��,����)�϶��� ��հ�
		int total = 0; //row�� col�� ���� �������� �ʿ���.�ʱ�ȭ
		for (int row = 0; row < score.length; row++) {//row�� �ݺ���
			total = 0;

			for (int col = 0; col < score[row].length; col++) { //col(��,����) �������� ������ ��
				total += score[row][col];
			}
			System.out.println((row + 1) + "�� �л� ���:" + (total * 1f / score[row].length));
		}   //���׿����ڸ� �������
		int korTotal=0; 
		int engTotal=0; 
		int mathTotal=0;
		for(int row=0; row<score.length;row++){ //���񺰷θ� ����� ���� �Ǳ⶧���� row(����)������ �Ǵ°� ����/
			korTotal+=score[row][0];
			engTotal+=score[row][1];
			mathTotal+=score[row][2]; 
		}
	System.out.println("��ü �л��� �������:"+korTotal/3f);	
	System.out.println("��ü �л��� �������:"+engTotal/3f);
	System.out.println("��ü �л��� �������:"+mathTotal/3f);
	}
}
