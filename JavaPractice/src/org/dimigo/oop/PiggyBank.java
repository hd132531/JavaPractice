/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *		|_ PiggyBank
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 6. 12.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class PiggyBank {
	private static int balance;
	
	public void putMoney(FamilyMember member, int account){
		System.out.println(member.getmemberName()+" "+account+"원 넣음");
		PiggyBank.balance+=account;
	}
	
	public void printBalance(){
		System.out.println("돼지저금통 총 금액 : "+balance);
	}
}
