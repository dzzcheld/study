package com.test.statement;

public class ForStatementTest2 {

	public static void main(String[] args) {

		// 1~10������ ¦���� ���Ͻÿ�.
		int sum = 0;
		for (int i = 1; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println("������ ������:" + i);
				sum = sum + i;
				System.out.println(sum);

				// 2�� �������� �ۼ��Ͻÿ�.
				System.out.println("2�� �������� �ۼ��Ͻÿ�.");
				int dan = 2;
				for (int gop = 2; gop < 10; gop++) {
					System.out.println(dan + "*" + gop + "=" + dan * gop);

					for (int dann = 2; dann < 10; dann++)
						
					{
						System.out.println(dan + "���Դϴ�.");// ���� �ݺ� �ϳ��� ����
						for (int gopp = 1; gopp < 10; gopp++)
							
						{
							System.out.println(dann + "*" + gopp + "=" + dann * gopp);
						} // ���� �ݺ� �ϳ��� ���� 10��
					} 
					//����� �ﰢ�� 
					char symbol='*'; 
					for(int row=1; row<11; row++){}
                    for(int num=1; num<row+1; num++){
                    	System.out.println(symbol);
                    	System.out.println();
                    }					
                      int row2=10;
                     for(int row2=1; row2<row2+1; row2++){}
                     for(int num2=1; num2<row2+2; num2++){
                    	 System.out.println(symbol);
                    	 System.out.println();
                     }
                     //(1,1) (2,3) (3,4)
                     int value=0; 
 					for(int row=1; row<11; row++){}
                     for(int num=1; num<row+1; num++){
                     	System.out.println(++value);
                     	System.out.println();
                     	
                     }					
				}

			}
		}
	}
}
