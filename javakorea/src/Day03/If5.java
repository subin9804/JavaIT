package Day03;

import java.util.Scanner;

public class If5 {
	public static void main(String[] args) {
		// 윤년 구하는 프로그램 만들기
		// 년도를 입력받고 윤년인지 아닌지 판별해주는 ㅎ프로그램을 만들어보기
		
		// 윤년: 해당 년도가 4로 나누어 떨어지고 100으로는 나누어 떨어지지 않으면 윤년
		// 혹은 400으로 나누어 떨어지면 무조건 윤년
		
		Scanner sc = new Scanner(System.in);
		int year;
		System.out.println("년도를 입력하세요>>");
		year = sc.nextInt();
		
		if((year % 4 == 0) && !(year % 100 == 0)) {
			System.out.println("윤년");
		}else if(year % 400 == 0) {
			System.out.println("윤년");
		}else {
			System.out.println("윤년이 아님");
		}
		
	}
}