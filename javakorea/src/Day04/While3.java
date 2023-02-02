package Day04;

public class While3 {
	public static void main(String[] args) {
		// 반복문 예제
		int i = 0;
		while(i < 10) {
			System.out.println(i+"번");
			i++;
		}
		
		// 퀴즈1
		int a = 0;
		while(a < 5) {
			System.out.println("안녕");
			a++;
		}
		
		// 퀴즈2
		int b = 0;
		int sum = 0;
		while(b < 11) {
			sum += b;
			b++;
		}
		System.out.println(sum);
		
		
		
		
	}
}
