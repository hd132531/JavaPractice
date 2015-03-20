package org.dimigo.basic;

public class Operater {

	 public static void main(String[] args) {
		int q=9, m=10;
		double h=5.8;
		double j=5.4;
		int a=9;
		double s1=(q+m)*h/2;
		double s2=a*j;
		String l="사다리꼴";
		String p="평행사변형";
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println(l+" 넓이 :" +s1);
		System.out.println(p+"  넓이 : "+s2);
		if(s2<s1){
			System.out.println(l+""+ "이 "+p+"보다 "+(s1-s2)+"더 큽니다.");}
		else if(s2>s1){
			System.out.println(p+" 이"+l+"보다 "+(s2-s1)+"더 큽니다.");}
		else{
			System.out.println("두 도형의 넓이가 같습니다.");}
	}

}
