package com.ustglobal.exception.customamount;

public class AmountCheck {

	public static void main(String[] args) {
		AmountValidator av = new AmountValidator();
		try {
		av.amount(20000);
		System.out.println("Withdrown cash");
		}catch(InvalidAmountException e) {
			System.out.println(e.getMessage());
		}

	}

}
