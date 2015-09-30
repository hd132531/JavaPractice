/**
 * 
 */
package org.dimigo.collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
public class MelonGenreChart {

	/**
	 * @param args
	 */
	public static void printMap(Map<String,List<Music>> melonChart){
		
		for(String key: melonChart.keySet()){
			System.out.println("["+key+"]");
			for(Music m:melonChart.get(key)){
				System.out.println(m.toString());
			}
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<	String, List<Music> > melonGenreChart=new HashMap<>();
		
		List<Music> ballad=new ArrayList<Music>();
		
		ballad.add(new Music("Planet","빅건"));
		ballad.add(new Music("자바를 자바라","김자바"));
		ballad.add(new Music("Call me","허경영"));
		
		melonGenreChart.put("발라드", ballad);
		List<Music> dance=new ArrayList<Music>();
		dance.add(new Music("남행열차","누구지"));
		dance.add(new Music("가질 수 없는 너","화생방실 클레오파트라"));
		melonGenreChart.put("댄스", dance);
		
		System.out.println("---------<< 멜론 장르별 챠트>>----------");
		printMap(melonGenreChart);
		
		System.out.println("---------<< 발라드 3위 곡 변경>>----------");
		melonGenreChart.get("발라드").set(2, new Music("asdf","qwer"));
		printMap(melonGenreChart);
		
		System.out.println("---------<< 발라드 1위 곡 삭제>>----------");
		melonGenreChart.get("발라드").remove(0);
		printMap(melonGenreChart);
		
		System.out.println("---------<< 전체 리스트 삭제>>----------");
		melonGenreChart.clear();
		printMap(melonGenreChart);
		
	}

}
