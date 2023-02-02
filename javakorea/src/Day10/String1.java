package Day10;

public class String1 {
	public static void main(String[] args) {
		MyString1 ms1 = new MyString1();
		ms1.go();
	}
}

class MyString1 {
	public void go() {
		//String: 클래스, 기본자료형x
		String str1 = "string1";		// 편하게 쓰기 위한 간략화
		String str2 = new String("string2");
		
		System.out.println(str1);
		System.out.println(str2);
		
		System.out.println(str1 == str2);		// 서로 다른 객체이기 때문데 false
		System.out.println(str1.equals(str2));	// .equals를 통해서 문자열 비교
		System.out.println(str1.equalsIgnoreCase(str2));	// 대소문자 무시하고 비교
	}
}