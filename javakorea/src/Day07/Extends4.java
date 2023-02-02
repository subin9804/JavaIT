package Day07;

public class Extends4 {
	public static void main(String[] args) {
		Human human = new Human("홍길동",35);
		System.out.println("이름: "+human.getName()+", 나이: "+human.getAge());
		
		Member member = new Member("홍길동", 35 , 10075);
		member.memberInfo();
	}
}

// 사람 Human
// 이름, 나이
// 생성자를 통해서 정보를 입력
// 게터세터
class Human {
	protected String name;
	protected int age;
	
	public Human(String name, int age){
		System.out.println("사람 정보 입니다");
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

}

class Member extends Human {
	private int memNo;
	Member(String name, int age, int memNo){
			super(name, age);		// 부모의 생성자를 사용
			this.memNo = memNo;
	}
	
	public int getMemNo() {
		return memNo;
	}
	
	public void setMemNo(int memNo) {
		this.memNo = memNo;
	}
	public void memberInfo() {
		System.out.println("이름: "+this.getName()+", 나이: "+this.getAge()+", 회원번호: "+this.getMemNo());
	}
}
