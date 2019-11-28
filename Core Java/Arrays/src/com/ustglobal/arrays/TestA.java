package com.ustglobal.arrays;

public class TestA {
	public static void main(String[] args) {
		int[] nums = new int[5];
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		for(int i =0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
		System.out.println("**************************");
		for(int num : nums) {
			System.out.println(num);
		}
		System.out.println("++++++++++++++++++++++++++++");
		char ch[]= {'a','b','c','d','e'};
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i]);
		}
		System.out.println("=============================");
		for(int c: ch) {
			System.out.println(c);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		boolean b[]= {true,false,true,false,true,false};
		for(int i =0;i<b.length;i++) {
			System.out.println(b[i]);
		}
		System.out.println("@@@@@@@@@@@@@@@@@");
		for(boolean t : b) {
			System.out.println(t);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		
		double d[]= {24.11,43.56,87.55};
		for(int i=0;i<d.length;i++)
		{
			System.out.println(d[i]);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(double l: d) {
			System.out.println(l);
		}
		String[] names= {"aishu","manu","vinu","sachin","akshi"};
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$");
		for(String s : names) {
			System.out.println(s);
		}
	}

}
