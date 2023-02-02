package Day13;

public class Sync1 {
	public static void main(String[] args) {
		Toilet toilet = new Toilet();
		Thread t1 = new Thread(toilet, "사람1");
		Thread t2 = new Thread(toilet, "사람2");		// 하나의 클래스를 두 쓰레드가 공유할 때 '동기화'
		// 동기화를 하지 않았을 때는 두 쓰레드가 하나의 변수(time)을 각각 이용한다
		
		t1.start();
		t2.start();
	}
}

// 식당 화장실이 1개, 사람은 많다
// 동시에 화장실을 이용할 수는 없으니 한명이 사용하면 다른 한명은 대기를 해야한다
class Toilet implements Runnable {
	private int time = 0;
	@Override
	public void run() {
		synchronized(this) {
			time = 0;
			System.out.println("화장실 들어감");
			while(time < 5) {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				time++;
				System.out.println(Thread.currentThread().getName()+" 화장실 사용 중..."+time+"초");
			}
			System.out.println("화장실 비움");
		}
		
	}
	
}
