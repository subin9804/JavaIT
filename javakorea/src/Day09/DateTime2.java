package Day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime2 {
	public static void main(String[] args) {
		MyTimer2 mt2 = new MyTimer2();
		mt2.go();
	}
}

class MyTimer2 {
	public void go() {
		while(true) {
			curtime();
			try {
				Thread.sleep(1000);		// 1000ms동안 중지
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void curtime() {
		// 현재시간 Calendar, Date, SimpleDateFormat
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();		// 현재 시간을 얻음
		
		SimpleDateFormat sdf = new SimpleDateFormat("yy.MM.dd. HH:mm:ss");
		String cur_time = sdf.format(date);			// 형식재구성
		
		System.out.println(cur_time);
	}
}
