package org.dimigo.basic;

public class Condition {

	public static void main(String[] args) {
		int dis=10;
		String car ="고속버스";
		int c;
		if(dis >0){
			switch(car){
			case "고속버스" :
				c=850;
				if(dis<=10);
				else if(dis<=20) c+=300;
				else if(dis<=30) c+=600;
				break;
			case "경차" :
				c=300;
				if(dis<=10);
				else if(dis<=20) c+=200;
				else if(dis<=30) c+=400;
				break;
			default :
				c=600;
				if(dis<=10);
				else if(dis<=20) c+=200;
				else if(dis<=30) c+=400;
				break;
			}
			System.out.println("<<고속도로 통행료 계산>>");
			System.out.println("거리 : "+dis+"km");
			System.out.println("차종 : "+car);
			System.out.println("통행료 : "+c+"원");
		}
		else{
		System.out.println("거리는 0보다 커야함");	
		}
	}
}