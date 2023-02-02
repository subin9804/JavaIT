package Day04;

import java.util.Scanner;

public class Flow3 {
	public static void main(String[] args) {
		// #3: 수도 맞추기
		// 무한반복 -> 입력 -> 맞추면 break
		
		Scanner sc = new Scanner(System.in);
		String answer = null;
		while(true) {		// 무조건 맞으니까 무한반복
			System.out.println("대한민국의 수도는?");
			answer = sc.next();
			if (answer.equals("서울")) {		// String문자열이 == 사용이 불가 -> .equals
				System.out.println("정답");
				break;
			}else {
				System.out.println("틀렸습니다");
				continue;
			}	
		}
		
		
	}
}