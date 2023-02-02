package Day13;

public class Review {
	public static void main(String[] args) {
		// 컬렉션: ArrayList(자바에서 만든 배열), HashMap(순서 -> 키), Set(중복X, 순서X)
		// 쓰레드: Thread, Runnable를 상속받아 사용
		MyThread t1 = new MyThread();
		
		MyRunnable r1 = new MyRunnable();
		Thread t2 = new Thread(r1);
		
		t1.start();		// 쓰레드 시작
		
		try {t1.join();}
		catch (InterruptedException e) {		// t1외에 다른 쓰레드는 대기
			e.printStackTrace();
		}
		
		t2.start();		// 쓰레드 시작
	}
}

class MyThread extends Thread {
	@Override
	public void run() {
		System.out.println("여기있는 코드가 실행");
	}
}

class MyRunnable implements Runnable {
	@Override
	public void run() {
		System.out.println("인터페이스 재정의");
	}
	
}