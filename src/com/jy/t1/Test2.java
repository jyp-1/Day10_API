package com.jy.t1;

import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 주민등록번호 991222-1234567
		// 9  7  1  2  2  2  1  2  3  4  5  6 7(검증용 번호)
	  // * 2  3  4  5  6  7  8  9  2  3  4  5
	// 2. 18  21 4 10 12 14  8 18  6 12 20 30 = 173
		// 3. 173/11 --몫 15 나머지 8

		// 4. 11 - 8(나머지) --8(결과값)
		// 4_1. 결과값이 두자리라면
		// 결과 값/10 -- 나머지 결과 값으로
		// 5. 결과값 == 검증용 번호

		Scanner sc = new Scanner(System.in);
		System.out.println("주민등록번호를 입력하세요(-는 제외)");
		String jumin = sc.next();
		
		//주민번호 
		int[] jg =new int [13];				//주민등록 나열
		
		int [] g = {2,3,4,5,6,7,8,9,2,3,4,5}; //곱할 것들
		
		int[] result = new int[13];				//곱한 결과
		

		for (int i = 0; i < jumin.length(); i++) { 
			String a = jumin.substring(i, i + 1);  //주민등록번호의 길이만큼 하나씩 분리
			jg[i]=Integer.parseInt(a);			   //배열->숫자
			System.out.println("집에서 작업");
		}
		
		

	}

}
