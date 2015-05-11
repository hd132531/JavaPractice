/**
 * 
 */
package org.dimigo.oop;

import java.util.Scanner;

/**
 * <pre>
 *org.dimigo.oop
 *		|_ Question
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 5. 11.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class Question {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String answer;
			Scanner scanner=new Scanner(System.in);
			System.out.println("가장 싫어하는 회사는?");
			answer=scanner.nextLine();
			if(answer.equals("아라코")){
				System.out.println("정답입니다!! ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			}
			else System.out.println("틀렸습니다!! ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ");
			System.out.println("가장 먹고싶은것은?");
			answer=scanner.nextLine();
			if(answer.equals("치킨")){
				System.out.println("정답입니다!! ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			}
			else System.out.println("틀렸습니다!! ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ");
			System.out.println("지금 가장 필요한것은?");
			answer=scanner.nextLine();
			if(answer.equals("귀가")){
				System.out.println("정답입니다!! ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			}
			else System.out.println("틀렸습니다!! ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ");
			System.out.println("제일 맛없는것은?");
			answer=scanner.nextLine();
			if(answer.equals("큐브고기")){
				System.out.println("정답입니다!! ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
			}
			else System.out.println("틀렸습니다!! ㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜㅜ");

	}

}
