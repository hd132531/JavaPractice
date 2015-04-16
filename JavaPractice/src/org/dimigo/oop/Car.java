/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *		|_ Car
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 4. 13.
 *</pre>
 * @author :정희조
 *
 * @version :1.00
 */
public class Car {
	private	String company;
	private	String model;
	private	String color;
	private	int maxSpeed;
	private	int price;
	public 	String getCompany(){
	return company;
	};
	public		String getModel(){
		return model;
	};
	public		String getColor(){
		return color;
	};
	public		int getMaxSpeed(){
		return maxSpeed;
	};
	public		int getPrice(){
		return price;
	}
	public 	void setCompany(String s){
		company=s;
	};
	public		void setModel(String s){
		model=s;
	};
	public		void setColor(String s){
		color=s;
	};
	public		void setMaxSpeed(int i){
		maxSpeed=i;
	};
	public		void setPrice(int i){
		price=i;
	}
	
}
