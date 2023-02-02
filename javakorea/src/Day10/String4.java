package Day10;

import java.util.Scanner;

public class String4 {
	public static void main(String[] args) {
		MyString4 ms4 = new MyString4();
		ms4.go();
	}
}

class MyString4 {
	Scanner sc = new Scanner(System.in);
	public void go() {
		System.out.println(won());
	}
	
	public String won() {
		// 정수를 입력받아서 천원단위로 ,를 찍어 출력
		System.out.println("숫자를 입력하세요");
		int num = Integer.parseInt(sc.nextLine());
		String result = Integer.toString(num);
		int result_len = result.length();
		String parse1, parse2, parse3, parse4;
		int count = 0;
		
		if(num < 1000) {
			
		}else if (num < 10000) {
			parse1 = result.substring(1, 4);
			parse2 = result.substring(0, 1);
			result = parse2+","+parse1;
		}else if (num < 100000) {
			parse1 = result.substring(2, 5);
			parse2 = result.substring(0, 2);
			result = parse2+","+parse1;
		}else if (num < 1000000) {
			parse1 = result.substring(3, 6);
			parse2 = result.substring(0, 3);
			result = parse2+","+parse1;
		}else if (num < 10000000) {
			parse1 = result.substring(4, 7);
			parse2 = result.substring(1, 4);
			parse3 = result.substring(0, 1);
			result = parse3+","+parse2+","+parse1;
		}else if (num < 100000000) {
			parse1 = result.substring(5, 8);
			parse2 = result.substring(2, 5);
			parse3 = result.substring(0, 2);
			result = parse3+","+parse2+","+parse1;
		}else if (num < 1000000000) {
			parse1 = result.substring(6, 9);
			parse2 = result.substring(3, 6);
			parse3 = result.substring(0, 3);
			result = parse3+","+parse2+","+parse1;
		}else {
			parse1 = result.substring(7, 10);
			parse2 = result.substring(4, 7);
			parse3 = result.substring(1, 4);
			parse4 = result.substring(0, 1);
			result = parse4+","+parse3+","+parse2+","+parse1;
		}
	
	
//		switch(result_len) {
//		case 4:
//			// 9999
//			parse1 = result.substring(1, 4);
//			parse2 = result.substring(0, 1);
//			result = parse2+","+parse1;
//			break;
//		case 5:
//			parse1 = result.substring(2, 5);
//			parse2 = result.substring(0, 2);
//			result = parse2+","+parse1;
//			break;
//		case 6:
//			parse1 = result.substring(3, 6);
//			parse2 = result.substring(0, 3);
//			result = parse2+","+parse1;
//			break;
//		}
//		case 7:
//			parse1 = result.substring(4, 7);
//			parse2 = result.substring(1, 4);
//			parse3 = result.substring(0, 1);
//			result = parse3+","+parse2+","+parse1;
//			break;
//		case 8:
//			parse1 = result.substring(5, 8);
//			parse2 = result.substring(2, 5);
//			parse3 = result.substring(0, 2);
//			result = parse3+","+parse2+","+parse1;
//			break;
//		case 9:
//			parse1 = result.substring(6, 9);
//			parse2 = result.substring(3, 6);
//			parse3 = result.substring(0, 3);
//			result = parse3+","+parse2+","+parse1;
//			break;
//		case 10:
//			parse1 = result.substring(7, 10);
//			parse2 = result.substring(4, 7);
//			parse3 = result.substring(1, 4);
//			parse4 = result.substring(0, 1);
//			result = parse4+","+parse3+","+parse2+","+parse1;
//			break;
//		}

		return result;
		
	}
}
