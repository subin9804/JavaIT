package Day02;

public class If2 {
	public static void main(String[] args) {
		
		int age = 30;
		
		if(age <10) {
			System.out.println("미성년자");
			}		// 조건 검사
		else if(age < 20) {		// 그 다음 검사
			System.out.println("10대");
		}
		else if(age < 30){
			System.out.println("20대");
		}
		else if(age < 40) {
			System.out.println("30대");
		}
		else {
			System.out.println("그외 40대 이상");
		}		// 다 틀리면
		
		
		
		// 퀴즈2
		int 나이 = 10;
		int 금액 = 0;
		
		if(나이 >= 20) {
			System.out.println("성인");
			금액 = 1000;
		}else if(나이 >= 14) {
			System.out.println("청소년");
			금액 = 650;
		}else {
			System.out.println("어린이");
			금액 = 400;
		}
		
		System.out.println("금액은 " +금액+ "원");

	}
}

	