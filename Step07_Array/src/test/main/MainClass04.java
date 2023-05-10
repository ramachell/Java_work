package test.main;

import test.pac.Bike;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  1. Bike 객체를 담을수 있는 방 3개짜리 배열 객체를 생성해서 bikes에 담기
		 *  2. 배열의 0,1,2 방에 Bike 객체를 생성해서 담기
		 *  3. 반복문 for 사용해서 순서대로 각각 Bike 객체의 ride() 메소드 호출
		 */

		Bike[] bikes = new Bike[3];

		bikes[0] = new Bike();
		bikes[1] = new Bike();
		bikes[2] = new Bike();

		for (int i = 0; i < bikes.length; i++) {
			bikes[i].ride();
		}
		System.out.println("--------------------");
		for (Bike tmp : bikes) {
			tmp.ride();
		}
	}

}
