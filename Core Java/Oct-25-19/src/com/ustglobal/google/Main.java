package com.ustglobal.google;

public class Main {

	public static void main(String[] args) {
		Google d = new GoogleDrive();
		Google g = new Gmail();
		SelectOption s = new SelectOption();
		s.selectOption(d);
		s.selectOption(g);
	}
}
