/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *		|_ FamilyMember
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 6. 12.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class FamilyMember {
	static int memberCnt;
	private String memberName;
	
	public FamilyMember(String m){
		memberName=m;
		memberCnt++;
	}
	
	public String  getmemberName(){
		return memberName;
	}
	public static void printMemberCnt(){
		System.out.println("가족 총 인원수 : "+memberCnt+"명");
	}
	
}
