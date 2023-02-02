package Day03;

import java.util.Scanner;

public class Switch3 {
	public static void main(String[] args) {
		// 년도와 월을 입력하면
		// 해당 월이 몇일까지 있는지 알려주는 프로그램
		
		int year = 0;
		int month = 0;
		int day = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("해당 년도를 입력하세요");
		year = sc.nextInt();
		System.out.println("해당 월을 입력하세요");
		month = sc.nextInt();
		
		switch(month){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			day = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			day = 30;
			break;
		case 2:
			if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0)) {
				day = 29;
			}else {
				day = 28;
			}
			break;
		default:
			System.out.println("해당 월은 없습니다.");
		}
		
		if(month <= 12) {
			System.out.println(year+"년 "+month+"월은 "+day+"일까지 있습니다.");
		}
		
		
		
		
	}
}
