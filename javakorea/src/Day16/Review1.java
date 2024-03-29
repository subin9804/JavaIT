package Day16;

import java.util.Scanner;

public class Review1 {
	public static void main(String[] args) {
		// 출력 syso
		System.out.println("Hello World \n");
		// 입력 Scanner
		Scanner sc = new Scanner(System.in);
		
		// 변수와 자료형
		// 변수: 데이터를 저장할 수 있는 공간(저장공간), 수정 또는 반복사용
		// 자료형: int, double, String, boolean등, 개발자의 실수를 방지, 개발자의 의도를 명확화
		
		String str;		// 변수 선언
		boolean bool;
		int num = 0;	// 변수 초기화
		str = "";		// 값 대입
		
		num = sc.nextInt();		// 입력받은 정수 대입
		str = sc.next(); 		// 입력받은 문자열 대입
		str = sc.nextLine();	// 띄어쓰기도 가능
		num = Integer.parseInt(sc.nextLine());		// 문자열 -> 정수로 자료형 변환
		System.out.println((double)num);			// 자료형 변환
		
		// 연산자(연산 기호)
		num = num + 23;
		num = num - 23;
		num = num / 1;
		num = num * 2;
		num = num % 2;		// 나머지 구하기
		
		num = 3;			// 대입연산자(오른쪽에 있는 값을 왼쪽에 있는 공간에 담는다)
	
		bool = (num == 3);		// 같다
		bool = (num != 3);		// 다르다
		bool = num < 3;			// 작다
		bool = num > 3;			// 크다
		bool = num <= 3;		// 작거나 같다
		bool = num >= 3;		// 크거나 같다
	
		bool = (num == 3) && (num < 4);		// 그리고(앞에도 맞고 뒤에도 맞아야 true)
		bool = (num == 3) || (num < 4);		// 또는(앞 또는 뒤가 맞으면 true)
		bool = !(num == 3);		// not(값을 반대로 바꿈 true -> false, false -> true)
		
		// 줄인말
		num++;		// 1 더하고 저장(해당 라인이 끝나야 +1)
		++num;		// 1 더하고 저장(해당 라인 실행 전에 먼저 +1)
		num--;		// 1 빼고 저장
		--num;		// num = num - 1;
		
		num += 2;	// num = num + 2;
		num -= 2;
		num *= 2;
		num /= 2;
		num %= 2;
	
	}
}
