package Day06;

public class Class10 {
	public static void main(String[] args) {
		MyClass10 mc = new MyClass10();
		
		mc.quiz1();
		
		mc.quiz2("퀴즈2");
		
		String result3 = mc.quiz3("퀴즈3", " 해결!");
		System.out.println(result3);
		
		System.out.println(mc.quiz4(-3, 8));
	}
}

class MyClass10 {
	// #1 매개변수가 없고 리턴값이 없는 Hello World 출력해주는 메서드
	public void quiz1() {
		System.out.println("Hello World!");
	}
	
	// #2 매개변수가 String 1개, 매개변수의 문자열을 출력해주는 메서드
	public void quiz2(String str) {
		System.out.println(str);
	}
	
	// #3 매개변수로 String 2개를 받아서, 두 문자열을 합치고 return
	// return한 값은 main메서드에서 syso로 출력
	
	public String quiz3(String str1, String str2) {
		return str1 + str2;
	}
	
	// #4 매개변수로 int 2개를 받아서, 매개변수가 음수면 각각 양수로 만들고(절댓값) 더해서 return
	public int quiz4(int num1, int num2) {
		if(num1 < 0) {
			num1 = num1 * -1;
		}
		if(num2 < 0) {
			num2 = num2 * -1;
		}
		return num1 + num2;
	}
}