/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *		|_ CalculatorTest
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 6. 5.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class CalculatorTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator c=new Calculator(10,20);
		c.powerOn();
		System.out.println(c.add());
		System.out.println(c.sub());
		System.out.println(c.mul());
		System.out.println(c.div());
		c.powerOff();
	}

}
