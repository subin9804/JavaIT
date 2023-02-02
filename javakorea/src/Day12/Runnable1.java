package Day12;

public class Runnable1 {
	public static void main(String[] args) {
		// 쓰레드 추가 생성법1: Thread를 상속한다
		// 쓰레드 추가 생성법2: Runnable을 상속하고 사용하는 곳에서 Thread를 객체화한다.
		MyRunnable1 mr1 = new MyRunnable1();
		Thread t1 = new Thread(mr1);
		t1.start();
		
		// Thread 상속인 경우
		MyThread7 mt7 = new MyThread7();
		mt7.start();
		
	}
}

class ex1{}

// 자바: 다중상속 불가능, 이미 다른걸 상속받고 있으면 Thread 상속이 불가능
class MyRunnable1 extends ex1 implements Runnable {

	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			System.out.print(i+" ");
			try {Thread.sleep(100);} catch (Exception e) {}
		}	// Runnable은 인터페이스기 때문에 sleep메서드가 없음	
	}
}

class MyThread7 extends Thread {
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			try {sleep(1100);} catch (Exception e) {}
			System.out.print(i+" ");
		}
	}
}



