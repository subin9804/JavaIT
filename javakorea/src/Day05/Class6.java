package Day05;

public class Class6 {
	public static void main(String[] args) {
		Person 홍길동 = new Person();
		Person 이순신 = new Person();
		
		홍길동.name = "홍길동";
		홍길동.age = 66;
		홍길동.gender = "남성";
		홍길동.height = 176.6;
		이순신.name = "이순신";
		이순신.age = 33;
		이순신.gender = "남성";
		이순신.height = 180.9;
		
		홍길동.정보보기();
		홍길동.인사하기();
		이순신.정보보기();
		이순신.인사하기();
		
		
	}
}

class Person{
	String name;
	int age;
	String gender;
	double height;
	
	public void 정보보기(){
		System.out.println("이름: "+name+" 나이: "+age+" 성별: "+gender+" 키: "+height);
	}
	public void 인사하기() {
		System.out.println(name+"이 인사합니다.");
		
	}
	
}