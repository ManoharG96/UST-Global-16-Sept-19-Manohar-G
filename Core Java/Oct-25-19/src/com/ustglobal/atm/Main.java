package com.ustglobal.atm;

public class Main {

	public static void main(String[] args) {
		HDFC h = new HDFC();
		ATM a = new ATM();
		a.insertCard(h);
		ICICI i = new ICICI();
		a.insertCard(i);
		SBI s = new SBI();
		a.insertCard(s);
	}
}
