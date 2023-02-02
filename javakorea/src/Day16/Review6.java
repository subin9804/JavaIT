package Day16;

public class Review6 {
	public static void main(String[] args) {
		// 부모의 자료형으로 자식들을 객체화
		Inter1 r1 = new ReviewTest6Ex();
		Inter1 r2 = new RT6();
		
		r1.go();
		r2.go();
	}
}


class RT6 implements Inter1 {

	@Override
	public void go() {
		System.out.println("오버라이딩" + STR);
	}
}

class ReviewTest6Ex implements Inter1 {

	@Override
	public void go() {
		System.out.println("오버라이딩" + NUM);
	}
	
}

// 추상클래스: 클래스와 인터페이스의 중간, 구현 해도되고 안해도 되고
abstract class ReviewTest6 implements Inter1 {
	public abstract void method1();			// abstract을 붙이면 구현하지 않아도 된다
	public void method2() {					// 구현해야 한다

	}
	
	// public void go(){}			// 오버라이딩 해도 되고, 안해도 되고
}

interface Inter1 {
	// 상수 초기화: 수정이 불가능한 변수를 상수라고 함(final), 사용o, 대입x
	public final static int NUM = 3;
	String STR = "a";		// public final static이 생략되어있음
	// NUM = 4;			// 수정이 불가능
	
	// 메서드 선언: 상속받은 곳에서 구현해라{}
	public void go();
	
	
}