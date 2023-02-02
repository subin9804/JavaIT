package Day05;

public class Class1 {		// 클래스
	public static void main(String[] args) {	// main함수
		// main: 프로그램 시작점
		// 클래스명 변수명 = new 클래스명();
		MyClass1 mc = new MyClass1();	// 다른 클래스를 사용하기 위해 미리 해야 할 작업
		// function1()
		mc.function1();
		
		// 더하기(int num1, int num2)
		int result1 = 3 + 4;
		int result2 = mc.더하기(3,  4);
		
		System.out.println(result1);	// return 3+4
		System.out.println(result2);	// return 3+4
	}
}

// 클래스: 변수와 함수를 담은 꾸러미(묶음)
class MyClass1{
	// 변수: 값을 저장하는 공간
	int num = 3;
	String name = "홍길동";
	int num2 = 4;
	
	// 함수(메서드): 코드를 저장하는 공간
	int function1() {
		int n = 1;
		System.out.println("메서드1 사용"); 		// 클래스 내에서 사용하는 함수를 매서드라고 부른다.
		return 1;
	}
	
	int 더하기(int num1, int num2) {
		int result = num1 + num2;
		return result;
	}
	
	/*
	 자료형 함수명(함수를 사용할 때 전달할 값){
	 함수를 사용하면 실행할 코드
	 }
	 */
	
	// return: 함수를 사용한 곳에 "결과"로 알려줄 값
}
