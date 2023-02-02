package Day09;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTime3 {
	public static void main(String[] args) {
		MyTimer3 mt3 = new MyTimer3();
		mt3.go();
		
	}
}

class MyTimer3{
	String m_year;
	String m_month;
	String m_day;
	
	public void go() {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		
		SimpleDateFormat year = new SimpleDateFormat("yyyy년");
		m_year = year.format(date);		
		SimpleDateFormat month = new SimpleDateFormat("MM월");
		m_month = month.format(date);		
		SimpleDateFormat day = new SimpleDateFormat("dd");
		m_day = day.format(date);
		
		int day_int = Integer.parseInt(m_day);
		
		System.out.println(m_year);
		System.out.println(m_month);
		System.out.println("내일은 "+m_year+" "+m_month+" "+(m_day+1)+"일 입니다");
			
	}
	
}

/*
 2022년
 11월
 내일은 2022년 11월 27일 입니다.
 */
