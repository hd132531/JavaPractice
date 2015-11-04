/**
 * 
 */
package org.dimigo.thread;

/**
 * <pre>
 *org.dimigo.thread
 *		|_ Race
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 11. 4.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class Race {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runner r1=new Runner("홍길동");
		Runner r2=new Runner("홍길순");
		
		r1.setPriority(Thread.MAX_PRIORITY);
		r2.setPriority(Thread.MIN_PRIORITY);
		
		r1.start();
		r2.start();
	}

}
