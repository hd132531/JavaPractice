/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.List;

/**
 * <pre>
 *org.dimigo.collection
 *		|_ MelonChart
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 9. 23.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class MelonChart {

	/**
	 * @param args
	 */
	public static void printList(List<Music> melonChart){
		
		for(Music m:melonChart){
			System.out.println(m.toString());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Music> melonChart=new ArrayList<Music>();
		
		System.out.println("-<<멜론 차트>>-");
		melonChart.add( new Music("Call me","허경영"));
		melonChart.add( new Music("자바를 자바라","김자바"));
		melonChart.add( new Music("Planet","빅건"));
		printList(melonChart);
		System.out.println();
		System.out.println("-<<2위 곡 추가>>-");
		melonChart.add(1, new Music("욜맨","대정령"));
		printList(melonChart);
		System.out.println();
		System.out.println("-<<3위 곡 변경>>-");
		melonChart.set(2, new Music("늴리리야","미상"));
		printList(melonChart);
		System.out.println();
		System.out.println("-<<4위 곡 삭제>>-");
		melonChart.remove(3);
		printList(melonChart);
	}

}
