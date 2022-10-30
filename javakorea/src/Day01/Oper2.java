package Day01;

public class Oper2 {
	public static void main(String[] args) {
		String 글자1 = "Hello";
		String 글자2 = "Java";
		String 글자 = 글자1+글자2;	// 앞에 글자에 뒤에 글자가 붙음
		
		System.out.println(글자);
		
		// 1. 역슬래시 + t : 칸띄우기
		System.out.println("일\t이");
		
		// 2. 역슬래시 + n: 한줄 띄우기
		System.out.println("안녕\n하세요");
		
		// 3. 역슬래시 + ": "사용
		System.out.println("아무개는 말했다. \"반가워\"");
	}
}
