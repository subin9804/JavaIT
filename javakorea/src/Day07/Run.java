package Day07;

public class Run {
	public static void main(String[] args) {
		OverLoading1 ol1 = new OverLoading1();
		// 매개변수가 달라지면 함수명이 같아도 된다 - 오버로딩
		ol1.Print();
		ol1.Print(123);
		ol1.Print(3.14);
		ol1.Print(12, 13);
		
		OverLoading2 a1 = new OverLoading2();
		OverLoading2 a2 = new OverLoading2(333);
		OverLoading2 a3 = new OverLoading2(333, 444);
		OverLoading2 a4 = new OverLoading2("문자열로 객체화");
	}
}
