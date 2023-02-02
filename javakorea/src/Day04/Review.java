package Day04;

public class Review {
	public static void main(String[] args) {
		String name = "sung";	// 문자열 변수
		int age = 33;			// 정수 변수
		double height = 177.0;	// 실수 변수
		boolean marry = false;	// 불린 변수(참거짓)
		// 변수: 저장공간
				
		// 조건문: if, switch (조건이 맞으면 {}를 실행)
		// if~else if~else
		// switch~case~break
		
		if(true) System.out.println("한 줄만 있으면 중괄호 생략 가능");
		if(age >= 20) {
			// 20이상
			System.out.println("성인");
		}else if (age >= 0) {
			// 20미만, 0이상
			System.out.println("미성년자");
		}else {
			System.out.println("?");
			//0 미만
		}
		// false == 0, true == 0이외의 숫자
		
		// switch: 소괄호에 있는 내용과 case 옆에 있는 내용이 같으면 해당 라인부터 시작, break 만나면 종료
		switch(age/10 ) {
		case 0:
			System.out.println("어린이");
			break;
		case 1:
			System.out.println("10대");
			break;
		case 2:
			System.out.println("20대");
			break;
		default:
			System.out.println("30대 이상");
		}
		
	}
}