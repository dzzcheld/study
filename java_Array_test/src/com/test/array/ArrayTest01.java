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
		//변수선언은 block안에서만 유효함 ,큰곳에서 작은곳에 입력을 하려고하면 중복이 뜬다(바깥에서한번 안에서한번일때 
		//전역에 포함되어있는 변수가 선언된 상태에서 지역변수가 발동되면 지역변수의 존재가 잘못된 것이다 
		//지역변수 끼리는 그 독립성이 인정된다.지역변수에서 먼저 선언한 후에 전역변수에 선언을 하면 오류가 없다. 
		//class필드는 메모리 영역이 다르다(다른 변수)
		//출력할때는 같은 형태의 변수라도 그 주변의 변수부터 탐색하고 그 변수를 채택한다.
		// (없으면 전역변수로 눈을 돌림 하지만 전역변수는 지역변수를 포착하지 못한다.
		int[] intArray = new int[5]; // 공간확보
		int[] intArray2 = { 1, 2, 3, 4, 5 }; // 적은variable초기화를 할때는 적절한 방법이다

		int[] intArray3 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }; // 새로운
																		// 배열을
																		// 할당할때
																		// 쓰이는
																		// 용도다

		int[] intArray4 = new int[100]; // 0~99까지의 인덱스가 있다.
		for (int index = 0; index < intArray4.length; index++) {
			intArray4[index] = index + 1;// 반복적이기에 for문이 필요하다
			System.out.print(index);     //int index가 선언 되었더라면 중복처리였을 것이다
		}

		for (int index = 0; index < intArray4.length; index++) {
			System.out.println(intArray4[index] + (intArray4[index] % 10 != 0 ? "," : "\n"));
		} // 10으로 나눴을때 떨어지지 않으면","고 나누어 떨어지면 "\n"로 인해서 줄바꿈이 일어난다

		// 2차원 배열(형x열)-배열 안에 배열
		int[][] intArrays = new int[3][3];

		int[][] intArrays2 = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 }

		};

		int[][] score = { { 100, 100, 100 }, { 20, 20, 20 }, { 30, 30, 30 }, { 40, 40, 40 }, { 50, 50, 50 } };
		System.out.println(score);
		// row(행,세로)일때의 평균값
		int total = 0; //row와 col의 합을 내기위해 필요함.초기화
		for (int row = 0; row < score.length; row++) {//row의 반복문
			total = 0;

			for (int col = 0; col < score[row].length; col++) { //col(열,가로) 구구단의 원리가 들어감
				total += score[row][col];
			}
			System.out.println((row + 1) + "번 학생 평균:" + (total * 1f / score[row].length));
		}   //삼항연산자를 사용했음
		int korTotal=0; 
		int engTotal=0; 
		int mathTotal=0;
		for(int row=0; row<score.length;row++){ //과목별로만 평균을 내면 되기때문에 row(세로)만쓰면 되는것 같다/
			korTotal+=score[row][0];
			engTotal+=score[row][1];
			mathTotal+=score[row][2]; 
		}
	System.out.println("전체 학생의 국어평균:"+korTotal/3f);	
	System.out.println("전체 학생의 영어평균:"+engTotal/3f);
	System.out.println("전체 학생의 수학평균:"+mathTotal/3f);
	}
}
