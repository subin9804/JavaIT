package Day06;

public class Class8 {
	public static void main(String[] args) {
		Person 홍길동 = new Person("홍길동", 22, "남성", 177.6);
		Person 이순신 = new Person("이순신", 23, "남성", 188.6);
		// 해당 클래스 사용을 위해서 먼저 해줘야하는 작업을 문법으로 만듦(생성자)

		홍길동.정보보기();
		홍길동.인사하기();
		
		이순신.정보보기();
		이순신.인사하기();
	
	}
}

class Person {
	// 이름, 나이, 성별, 키
	String name;
	int age;
	String gender;
	double height;
	
	// 생성자의 이름은 클래스의 이름과 같음, 자료형이 없음
	Person(String name, int age, String gender, double height){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.height = height;
	}
	public void 정보보기(){
		System.out.println("이름: "+name+" 나이: "+age+" 성별: "+gender+" 키: "+height);
	}
	public void 인사하기() {
		System.out.println(name+"이 인사합니다.");
		
	}
	
}
