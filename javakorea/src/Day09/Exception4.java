package Day09;

public class Exception4 {
	public static void main(String[] args) {
		
	
	Throws4 throws4 = new Throws4();
	throws4.go();
	
	Throws4 t4 = null;		//공간만 확보(객체선언)
	t4 = new Throws4();		// 객체화(객체초기화)
	
	new Throws4();		// 객체생성은 하되 저장하지 않았음(생성자만 사용)
	Throws4 tt4 = new Throws4();	// 생성자 사용 + 객체만큼의 공간이 확보(공간낭비)
	}
}

class Throws4 {
	public void go() {
		try {
			MyExcept();
		}catch (Exception e) {
			System.out.println("호출한 메서드에서 예외처리");
		}
	}
	
	public void MyExcept() throws Exception {
		throw new Exception();		// Exception 클래스를 1회용 객체화해서 사용
	}
}