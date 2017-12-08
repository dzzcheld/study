package com.stirng.test;

public class StringTest {

	public static void main(String[] args) {
		
		String msg="반갑습니다."; 
		System.out.println(msg);
		System.out.println("문자열길이:"+msg.length());
		System.out.println("문자열 비교:"+msg.equals("바바바"));
		
		//클래스이자 배열을 갖고있는 키워도가 String이고 reference타입이다
        System.out.println("문자탐색:"+msg.contains("반갑"));
        System.out.println("비고 인덱스 반환:"+msg.indexOf("니다"));
        System.out.println("index의 글자 반환:"+msg.charAt(2)); 
        System.out.println("빈문자열 확인:"+msg.isEmpty()); 
        System.out.println("문자열 교체:"+msg.replace("반갑습","감사합")); 
        System.out.println("문자열 잘라내기:"+msg.substring(0,3));
        //w\직접적으로 바꾸는것이 아니라 리턴만 하는거다 
        System.out.println("대문자 변환:"+msg.toUpperCase());
        System.out.println("소문자 변환:"+msg.toLowerCase()); 
        //실제로 데이터베이스에는 모두 대문자로 저장된다.단, 패스워드는 예외다 
	
	for(int index=0; index<msg.length(); index++){
	System.out.println(msg.charAt(index));
	char ch=msg.charAt(index); 
	boolean isNumber=false; //is는 ~~이다 ~~이냐 라는 의미를 갖는다 flag는 불린타입인데 신호등과 같은 존재다
	if(!(ch>=48 && ch<=57)); {
		isNumber=false; 
	                                           }
	//이항연산자 인트 이하는 모두 인트로 바꾼다 askii코드 값으로 비교를한다
	}
	}
	System.out.println(isNumber?"숫자":"숫자가 아님");
	
	
	} 
	
	
	

}
