/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 *org.dimigo.thread
 *		|_ Runner
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 11. 4.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class Runner2 implements Runnable{
	private String name;
	
	Runner2(){}
	
	Runner2(String _name){
		name=_name;
	}
	
	public void run(){
		System.out.println(name+" 출발");
		for(int current_time=100;current_time>=0;current_time-=10){
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(name+" "+current_time+" 미터");
		}
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name +" 골인!");
		
	}
}
