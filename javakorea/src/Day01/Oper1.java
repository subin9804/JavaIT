package Day01;

public class Oper1 {
	public static void main(String[] args) {
		// string: 글자(문자열)
		// int: 숫자(정수)
		// double: 소수점 있는 숫자(실수)
		
		// 자료형 변수명;
		int 숫자1 = 3;
		int 숫자2 = 2;
		
		// 프로그래밍에서는 연산이 가능 (+, -, *, /, ...)
		// 연산을 시켜주는 기호들을 '연산자'라고 부름
		System.out.println(1+1);
		System.out.println(3-4);
		System.out.println(3*3);
		System.out.println(10/2);
		
		
		// 연산은 변수끼리도 가능 (저장되어있는 값을 연산함)
		숫자1 = 1;
		숫자2 = 2;
		int 숫자3 = 숫자1 + 숫자2;
		System.out.println(숫자3);
		System.out.println(숫자1 + 숫자2);
		
		// 글자는 더하기만 가능
		String 글자1 = "안녕!";
		String 글자2 = "하세요!";
		System.out.println(글자1 + 글자2);
		
		// 0. 문자열을 합치는 덧셈
		String str = "Hello" + "World";
		System.out.println(str);
		
		// 1. 덧셈
		int num = 1+1;
		System.out.println(num);
		
		// 2. 뺄셈
		int num1 = 2-1;
		System.out.println(num1);
		
		// 3. 곱셈
		int num2 = 3*3;
		System.out.println(num2);
		
		// 4. 나눗셈
		int num3 = 9/3;
		System.out.println(num3);
		
		// 5. 나머지구하기 연산자
		int num4 = 10%3;
		System.out.println(num4);
		
		// 우선순위 높음: *, /
		// 우선순위 낮음: +, -
		// 우선순위가 낮은 연산자를 우선적으로 계산하고 싶다면 ()로 감싸준다
		
		// 합계와 평균 구하기
		int 국어 = 55, 영어 = 41, 수학 = 62;
		int 합계 = 국어 + 영어 + 수학;
		System.out.println("총점: "+합계);
		double 평균 = (double)합계/3;
		System.out.println("평균: " +평균);
		// 연산자를 소수점이 없는 정수로 정해놓았기 때문에 산출값은 소수점 이하의 자리가 표시되지 않는다.
		// 정수끼리의 연산자에 double처리를 해도 산출이 안되므로 계산되는 숫자 역시 소수자리까지 표시하여 입력하여야 한다.
		// double 평균 = (double)합계/3 = 자료형 변환 (정수를 실수형으로 변환하여 계산)
	
		// Ctrl + M: 패키지 익스플로러
	}
}
