package Day02;

public class Review {
	public static void main(String[] args) {
		// 프로그래밍 언어(자바): 컴퓨터한테 일을 시키기 위한 문법
		// 슬래시 2개는 코딩이 아닌 메모로 간주. (주석)
		
		// 출력 syso > Ctrl + spacd 자동완성
		// 실행 Ctrl + F11 (디버깅 없이 시작)
		
		String word = "Java";	// 자주 바꿀 필요가 있는 부분을 변수로 저장
		
		
		System.out.println("Hello "+word);
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		System.out.println("Hello World");
		// F11: 디버깅모드 (한줄씩 실행)
		// 아래로 복사 붙여넣기: Ctrl + Alt + 아래키
		
		// 변수: 저장공간
		String str ="Hi";	// 글자를 저장할 수 있는 공간
		int num = 0;		// 숫자를 저장할 수 있는 공간
		double dnum = 0.0;	// 소수점있는 숫자를 저장할 수 있는 공간
		// 맞지않는 자료형을 입력하면 오류처리됨. (개발자의 실수 방지)
		
		// 자료형 변환
		System.out.println((double)num);
		
		// 변수(공간)을 처음 만들 땐 변수이름 앞에다가 자료형을 적어주지만
		// 이미 만들어진 변수(공간)을 사용할 땐 자료형 없이 적어준다.
		str = "Hello";				// 다른 값을 대입
		System.out.println(str);	// 사용
		
		// = : 대입연산자 (오른쪽에 있는 값을 왼쪽의 공간에 담는다)
		str = "Java2";		// 왼쪽은 '공간'역할, 오른쪽은 '값'의 역할
				
		word = str;			// word: 공간 (왼쪽), str: 안에 들어있는 값 (오른쪽)
		System.out.println(word);
		word = word;
		
		// 변수이름 만들 때
		// 1. 맨앞에는 숫자x, 특수문자x (한글 혹은 영어만 가능)
		// 2. 띄어쓰기x (_로 대체)
		// 3. 특수문자x (예외도 있음
		
		
	}
}
