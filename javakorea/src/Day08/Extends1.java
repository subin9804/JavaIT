package Day08;

public class Extends1 {
	public static void main(String[] args) {
		StarBupyeong sb = new StarBupyeong(3000, "아메리카노");
		sb.sell();
		sb.info();
	}
}

// 1. 상속용, 2. 모든 메서드가 재정의되어야만 함, 3. 명세서(룰 제공)  ==>	Interface: 명세서대로 안하면 오류발생 (누락방지)
class Star {
	// 본사: 스타벅스가 갖춰야할 기본데이터와 기능
	protected int price;
	protected String menu;
	static int menu2;		// 기존 변수와 다른 공간에 저장되어서 계속 살아있음. 많이 만들면 프로그램 과부화될수있음
	
	// 생성자로 가격, 메뉴 정하기
	Star(int price, String menu){
		this.price = price;
		this.menu = menu;
	}

	// oo을 판매합니다.
	public void sell() {
		System.out.println(this.menu + "를 판매합니다.");
	}
	
	// oo의 가격은 oo입니다
	public void info() {
		System.out.println(this.menu+"의 가격은 "+this.price+"원 입니다.");
	}
}

class StarBupyeong extends Star {
	// 부평점: 스타벅스가 기본적으로 갖춰야할 것 + 부평점만의 특징
	
	// 생성자로 가격, 메뉴 재정의하기
	StarBupyeong(int price, String menu){
		super(price, menu);
	}
	
	// 부평정 - oo을 판매합니다.
	@Override
	public void sell() {
		System.out.println("부평점 - "+this.menu+"를 판매합니다.");
	}
	//부평정 - oo의 가격은 oo입니다.
	@Override
	public void info() {
		System.out.println("부평점 - "+this.menu+"의 가격은 "+this.price+"원 입니다.");
	}

}

// 인터페이스를 상속받을 때는 implements
class StarGangnam implements Star2{
	int price;
	String menu;
	
	public StarGangnam(int price, String menu) {
		this.price = price;
		this.menu = menu;
	}

	@Override
	public void sell() {
		System.out.println("강남점 - "+menu+"를 판매합니다.");
		
	}

	@Override
	public void info() {
		System.out.println("강남점 - "+menu+"의 가격은 "+price+"원 입니다.");
		
	}
}

interface AA{
	
}

// 다중상속 가능
class SS extends Star implements AA, Star2 {

	SS(int price, String menu) {
		super(price, menu);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void sell() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void info() {
		// TODO Auto-generated method stub
		
	}
}