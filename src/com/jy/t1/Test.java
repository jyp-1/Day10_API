package com.jy.t1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		// 스캐너를 사용..
		// 주민등록번호 입력 991222-1234567
		// 나이
		// 계절
		// 성별

		Scanner sc = new Scanner(System.in);
		/**
		 * System.out.println("주민등록번호를 입력해주세요"); String jumin = sc.nextLine();
		 * 
		 * String[] num = jumin.split("-"); jumin.trim();
		 */
		String jumin = "991222-1234567";

		// 나이
		String a = jumin.substring(0, 2);
		System.out.println(a);
		int year = 1900 + Integer.parseInt(a);
		System.out.println(2019 - year);

		// 계절
		a = jumin.substring(2, 4);
		year = Integer.parseInt(a);
		if (year >= 3 && year <= 5) {
			System.out.println("봄");
		} else if (year >= 6 && year <= 8) {
			System.out.println("여름");
		} else if (year >= 9 && year <= 11) {
			System.out.println("가을");
		} else {
			System.out.println("겨울");
		}

		// 성별
		a = jumin.substring(7, 8);
		// char ch =jumin.charAt(7);
		year = Integer.parseInt(a);
		if (year % 2 == 1) {
			System.out.println("남자");
		} else {
			System.out.println("여자");
		}
	}

}
