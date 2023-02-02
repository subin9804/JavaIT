package Day08;

// 추상클래스 (클래스와 인터페이스의 중간)
public abstract class AbstractClass1 implements Interface1 {

	// 구현을 안할거면 abstract -> 추상메서드. 무조건 재정의 필요
	public abstract void speed();
	
	// 구현을 할거면 -> 일반 메서드. 재정의 하지 않아도 오류발생x
	public void bigdata() {
		System.out.println("5G 사용");
	}
}
