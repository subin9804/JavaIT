package Day10;

public class String5 {
	public static void main(String[] args) {
		MyString5 ms5 = new MyString5();
		ms5.go();
	}
}

class MyString5 {
	// 프로그램끼리 메시지를 주고받을 때
	// 가격, 제품명, 수량 ==> 한번에(약속된 하나의 문자열) ==> 패킷화
	private String packet1 = "SAname=A01price=003000num=001ED";		// 아메리카노 1잔 3000원
	private String packet2 = "SAname=A02price=003500num=002ED";		// 카페라떼 2잔 3500원
	private String packet3 = "SAname=A03price=004000num=004ED";	// 카페모카 4잔 4000원
	int price, num, menu_num, price_sum;
	String name = "";
	
	public void go() {
		parsing(packet1);
		parsing(packet2);
		parsing(packet3);
	}
		
		public void parsing(String packet) {
			// packet ==> 주문내용: 아메리카노 1잔, 3000원
			switch(packet.charAt(7)) {
			case'A':		// 커피메뉴
				menu_num = Integer.parseInt(packet.substring(8, 10));
				if(menu_num == 1) {name = "아메리카노";}
				else if(menu_num == 2) {name = "카페라떼";}
				else if(menu_num == 3) {name = "카페모카";}
				else if(menu_num == 4) {name = "에스프레소";}
				break;
			case 'B':		// 디저트메뉴
				break;
			case 'c':		// 기타메뉴
				break;
			default:
				System.out.println("해킹");
			}
			
			num = Integer.parseInt(packet.substring(26, 29));
			price = Integer.parseInt(packet.substring(16,22));
			price_sum = num * price;
			
			System.out.println("주문내용: " + name + " "+ num + "잔, " + price_sum + "원");
		}

}
