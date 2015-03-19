package org.dimigo.basic;

public class TypeCasting {

	public static void main(String[] args) {
		int s=1700000;
		int e=3;
		int c=1500;
		System.out.println("<< 디미베네 연간 인건비 >>");
		System.out.printf("월 평균 급여 : %,d\n",s);
		System.out.printf("점포 내 직원수 : %,d명 \n",e);
		System.out.printf("점포 수 : %,d개\n",c);
		System.out.printf("\n\n연간 인건비 : %,d원",(long)s*(12*e*c));
		

	}

}
