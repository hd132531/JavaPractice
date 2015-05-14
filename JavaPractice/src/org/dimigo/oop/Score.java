/**
 * 
 */
package org.dimigo.oop;
import java.util.Scanner;

/**
 * <pre>
 *org.dimigo.oop
 *		|_ Score
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 5. 14.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class Score {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner(System.in);
		int kor,mat,eng;
		System.out.println("국어 점수 입력 => ");
		kor=scanner.nextInt();
		System.out.println("수학 점수 입력 => ");
		mat=scanner.nextInt();
		System.out.println("영어 점수 입력 => ");
		eng=scanner.nextInt();
		StringBuilder p=new StringBuilder()
		.append("<< 점수 출력 >>\n")
		.append("국어점수 : "+kor+"점\n")
		.append("수학점수 : "+mat+"점\n")
		.append("영어점수 : "+eng+"점\n")
		.append("총점 : "+(kor+mat+eng)+"점\n")
		.append("평균 : "+String.format("%.1f",(kor+mat+eng)/3.0)+"점");
		System.out.println(p);
	}

}
