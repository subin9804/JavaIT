package Day11;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class Review {
	public static void main(String[] args) {			// View(html)
		// ReviewClass 객체화
		ReviewModel rm = new ReviewModel(0, null);		// Model
		ReviewClass rc = new ReviewClass(rm);
		// go 메서드 사용
		rc.go();
	}
}

// 클래스: 변수 + 함수 ==> 멤버변수(private), 메서드(public)
class ReviewClass {
	ReviewModel rm;		// 나중에 코드관리를 유용하게 하기 위해 멤버변수들을 뭉쳐놓은 클래스
	// 날짜
	Calendar c = null;
	Date date = null;
	SimpleDateFormat sdf = null;
	// enum: 번호로 하면 나중에 알아보기 힘드니까 단어로 저장
	enum MyKeyword {
		ONE, TWO, THREE, FOUR		// 0, 1, 2, 3
	}
	
	// 생성자: 객체화를 할 때 자동으로 사용되는 함수
	public ReviewClass(ReviewModel rm) {
		this.rm = rm;
	}
	
	public void go() {
		Random rand = new Random();
		int randNum = rand.nextInt(100);		// Math.Random()*100
		
		rm.setNum(randNum);
		System.out.println(rm.getNum());
		
		// 날짜시간
		c = Calendar.getInstance();
		date = c.getTime();
		sdf = new SimpleDateFormat("yy.MM.dd, HH:mm:ss");
		sdf.format(date);
		rm.setStr(sdf.format(date));		// rm.str = sdf.format(date);
		System.out.println(rm.getStr());
	}
}

class ReviewModel {
	// 멤버변수
	private int num;
	private String str;
	
	public ReviewModel(int num, String str) {
		this.num = num;		// setNum(num);
		this.str = str;		// setStr(str);
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
	
}