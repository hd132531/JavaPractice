/**
 * 
 */
package org.dimigo.oop;

/**
 * <pre>
 *org.dimigo.oop
 *		|_ IdolGroup
 *
 *
 *1. 개요 :
 *2. 작성일 : 2015. 5. 28.
 *</pre>
 * @author :정희조
 *
 * @version :1.0
 */
public class IdolGroup {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			String[] idolGroup=new String[]{"빅뱅","2NE1","걸스데이"};
			String[][] members={
					new String[]{"GD","태양","대성","탑","승리"},
					new String[]{"CL","산다라박","박봄","민지"},
					new String[]{"유라","혜리","소진","민아"}
			};
			for(int i=0;i<members.length;i++){
				System.out.println("<<"+idolGroup[i]+" 멤버"+">>");
				for(int j=0;j<members[i].length;j++){
					System.out.println(members[i][j]);
				}
				System.out.println();
			}
	}

}
