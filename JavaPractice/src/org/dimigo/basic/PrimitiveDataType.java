package org.dimigo.basic;

public class PrimitiveDataType {

	public static void main(String[] args) {
		String n="아이유"; //이름
		boolean g =true; //성별구분
		int a=23;//나이
		double t=161.8;//키
		float m=44.3f;//질량
		char b='A';//피
		System.out.println("<<아이유 프로필>>");
		System.out.println("이름 : "+n);
		System.out.printf("성별 : ");
		if(g)System.out.println("여자");//성별
		else System.out.println("남자");
		System.out.println("나이 : "+a+"세");
		System.out.println("키 : "+t+"cm");
		System.out.println("몸무게 : "+m+"kg");
		System.out.println("혈액형 : "+b+"형");
	}

}
