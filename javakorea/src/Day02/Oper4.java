package Day02;

public class Oper4 {
	public static void main(String[] args) {
		// 연산자(연산기호, 특정한 기능)
				// 1. 산술연산자: +, -, *, /, %
				// 2. 대입연산자: =
				// 3. 누적연산자: +=, -=, *=, /=
				// 4. 증감연산자: ++, --
				// 5. 비교연산자: >, <, >=, <=, ==, !=
				// 6. 논리연산자: &&, ||, !
		
		int 숫자1 = 0;
		숫자1 += 1;	// 숫자1 = 숫자1 + 1;
		숫자1++;		// 숫자 1 += 1;
		
		숫자1 +=	2;	// 이건 안됨 (누적값이 1일 경우만 가능)
		
		숫자1--;		// 숫자1 -= 1;
		
		int num = 3;
		num--;		// num -= 1;
		System.out.println(num);
		num++;		// num += 1;
		System.out.println(num);
		
		++num;		// 앞에 쓰면 먼저 1을 누적연산하고 시작
		num++;		// 해당 코드 실행 후 1을 누적연산
		
		int 숫자2 = 0;
		System.out.println(++숫자2);		// ++하고 출력
		System.out.println(숫자2++);		// 출력하고 ++
		System.out.println(숫자2);
		
		num = num + 1;
		num += 1;
		num++;		// 셋 다 똑같은 값
	}
}
