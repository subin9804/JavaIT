package Day05;

public class Class6 {
	public static void main(String[] args) {
		Person 홍길동 = new Person();
		Person 이순신 = new Person();
		
		홍길동.getInfo("홍길동", 24, "남", 177.6);
		이순신.getInfo("이순신", 30, "남", 180.0);
		
		홍길동.정보보기();
		홍길동.인사하기();
		
		이순신.정보보기();
		이순신.인사하기();
		
	}
}

class Person{
	// 속성: 이름, 나이, 성별, 키
	
	// 정보보기(이름, 나이, 성별, 키 출력)
	// 인사하기(홍길동이 인사합니다 출력)
	
	String 이름;
	int 나이;
	String 성별;
	double 키;
	
	public void 정보보기() {
		System.out.println("이름: "+이름+", 나이: "+나이+", 성별: "+성별+", 키: "+키+"cm");
	}
	public void 인사하기 () {
		System.out.println(이름+"이(가) 인사합니다.");
	}
	public void getInfo(String 이름, int 나이, String 성별, double 키) {
		this.이름 = 이름;
		this.나이 = 나이;
		this.성별 = 성별;
		this.키 = 키;
	}
	
	
}