/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *		|_ PiggyBankTest
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 6. 12.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class PiggyBankTest {

	public static void main(String[] args) {
		FamilyMember me=new FamilyMember("나");
		FamilyMember bro=new FamilyMember("남동생");
		FamilyMember mom=new FamilyMember("엄마");
		FamilyMember dad=new FamilyMember("아빠");
		FamilyMember.printMemberCnt();
		PiggyBank p=new PiggyBank();
		p.putMoney(dad, 10000);
		p.putMoney(mom, 5000);
		p.putMoney(me, 2000);
		p.putMoney(bro, 1000);
		p.printBalance();
		p.putMoney(me, 1000);
		p.printBalance();
	}

}
