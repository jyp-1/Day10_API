package com.jy.t1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 주민등록번호 991222-1234567
		// 9 7 1 2 2 2 1 2 3 4 5 6 7(검증용 번호)
		// * 2 3 4 5 6 7 8 9 2 3 4 5
		// 2. 18 21 4 10 12 14 8 18 6 12 20 30 = 173
		// 3. 173/11 --몫 15 나머지 8

		// 4. 11 - 8(나머지) --8(결과값)
		// 4_1. 결과값이 두자리라면
		// 결과 값/10 -- 나머지 결과 값으로
		// 5. 결과값 == 검증용 번호

		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요");
		String jumin = sc.next();
		
		int sum=0; //합계를 담을 변수
		int idx=2; //
		

		// split 사용
		// String[] jumins= jumin.split("");
		// for(int i=0;i<jumin.length();i++) { System.out.println(jumins[i]); }
		/**
		 * for (int i = 0; i < jumin.length(); i++) { String n1 = jumin.substring(i, i +
		 * 1); System.out.println(n1);
		 * 
		 * int n = Integer.parseInt(n1);
		 * }
		 * 내가 해본거 
		 * 
		 */
		
		
		
		
		// charAt사용
		for (int i = 0; i < jumin.length(); i++) {
			if(i==6) {
				continue;
			}
			char ch = jumin.charAt(i);
			String n1 = String.valueOf(ch);
			
			int n = Integer.parseInt(n1);
			
			sum=sum+n*idx; //계산식
			idx++;
			
			System.out.println(ch);

			if(idx==10) {

				idx=2;

			}

		}

		

		sum=sum%11;

		

		sum = 11-sum;

		

		sum = sum%10;

		

		

		int result =  Integer.parseInt(String.valueOf(jumin.charAt(jumin.length()-1)));

		

		if(sum == result) {

			System.out.println("맞는 번호");

		}else {

			System.out.println("틀린 번호");

		}
			

		}
	}
