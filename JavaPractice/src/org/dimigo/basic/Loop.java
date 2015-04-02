package org.dimigo.basic;

public class Loop {

	public static void main(String[] args) {    
		
		for(int k=0;k<10;k++){
			for(int i=0;i<10;i++){
				if(k!=i){
					System.out.print(i+1);
				}
				else System.out.print("*");
			}
			System.out.println("");
		}

	}

}
