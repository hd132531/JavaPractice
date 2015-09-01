/**
 * 
 */
package org.dimigo.abstractclass;

/**
 * <pre>
 *org.dimigo.inheritance
 *		|_ SmartPhoneTest
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 8. 25.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class SmartPhoneTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone a=new IPhone("iphone 6","애플",700000);
		SmartPhone s=new Galaxy("갤럭시 S6","삼성",650000);
		
		System.out.println(a);
		a.turnOn();
		a.pay();
		a.useSpecialFuction();
		a.turnOff();
		System.out.println();
		System.out.println(s);
		s.turnOn();
		s.pay();
		s.useSpecialFuction();
		s.turnOff();
	}

}
