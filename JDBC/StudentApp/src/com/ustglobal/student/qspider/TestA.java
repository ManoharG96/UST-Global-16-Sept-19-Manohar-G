package com.ustglobal.student.qspider;
import static com.ustglobal.student.jspider.Remote.*;
import com.ustglobal.student.jspider.*;

public class TestA {

	public static void main(String[] args) {
		
		QTP q = new QTP();
		q.techQTP();
		
		Selenium s = new Selenium();
		s.techSelenium();
		
		Angular a= new Angular();
		a.techAngular();
		
		React r = new React();
		r.techReact();
		
		on();
		System.out.println(num);
		Remote r1 = new Remote();
		System.out.println(r1.sum);
	}

}
