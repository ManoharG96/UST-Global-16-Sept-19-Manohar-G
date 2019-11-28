package com.ustglobal.arrays;

public class TestB {
	public static void main(String[] args) {
		int nums[] = {10,20,30,40};
		receive(nums);
		int[] values = getArray();
		
		for(int val : values) {
			System.out.println(val);
		}
		String[] values1 = getArray1();
		for(String names:values1) {
			System.out.println(names);
		}
		
		
	}
	static void receive(int[] numbers) {
		for(int num : numbers) {
			System.out.println(num);
		}
	}
	static int[] getArray() {
		int[] values = {20,30,40,50};
		return values;
	}
	static String[] getArray1() {
		String[] values1 = {"akshi","chandu","vinu","manu"};
		return values1;
	}

}
