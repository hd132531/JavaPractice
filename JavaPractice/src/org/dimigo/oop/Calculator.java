/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *		|_ Calculator
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 6. 5.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class Calculator {
	private Integer num1;
	private Integer num2;
	public Calculator() {
	}
	public Calculator(int num1,int num2){
		this.num1=num1;
		this.num2=num2;
	}
	public void powerOn(){
		System.out.println("Calculator Powered On...");
	}
	public void powerOff(){
		System.out.println(("Calculator Powered Off..."));
	}
	public int add(){
		System.out.print(num1 + "+"+num2 +"=");
		return num1+num2;
	}
	public int sub(){
		System.out.print(num1 + "-"+num2+"=");
		return num1-num2;
	}
	public int mul(){
		System.out.print(num1 + "*"+num2+"=");
		return num1*num2;
	}
	public double div(){
		System.out.print(num1 + "/"+num2+"=");
		return (num1/(double)num2);
	}
}
