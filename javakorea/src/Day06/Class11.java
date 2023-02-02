package Day06;

public class Class11 {
	public static void main(String[] args) {
		Animal dog = new Animal("멍멍이", 7, "강아지");
		Animal cat = new Animal("냥이", 3, "고양이");
		
		dog.소개();		// 멍멍이의 나이는 7살이고 강아지 입니다.
		cat.소개();		// 냥이의 나이는 3살이고 고양이 입니다.
		
		dog.먹기();		// 멍멍이가 밥을 먹습니다.
		cat.먹기();		// 냥이가 밥을 먹습니다
		
		dog.짖기();		// 강아지 울음소리
		cat.짖기();		// 고양이 울음소리
	}
}

class Animal {
	private String name, type;
	private int age;
	
	Animal(String name, int age, String type) {
		this.name = name;
		this.age = age;
		this.type = type;
	}
	
	public void 소개() {
		System.out.println(name+"의 나이는 "+age+"살이고 "+type+" 입니다.");
	}
	
	public void 먹기() {
		System.out.println(name+"가 밥을 먹습니다.");
	}
	
	public void 짖기() {
		System.out.println(type+" 울음소리");
	}
}