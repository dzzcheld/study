package com.test.array;
import java.util.Scanner;
public class ArrayTest04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int[] intArray=new int[7];
		
		for(int i=0; i<intArray.length;i++){
			System.out.println((i+1)+"번째 숫자:");
			intArray[i]=Integer.parseInt(scan.nextLine());
		}
		Arrays.sort(intArray); //오름차순
		
		System.out.println("max num: "+intArray[intArray.length-1]); 
		System.out.println("min num: "+intArray[0]);
	}

}
