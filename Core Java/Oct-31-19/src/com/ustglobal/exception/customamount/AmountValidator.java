package com.ustglobal.exception.customamount;

public class AmountValidator {
	void amount(int am) {
		if (am>10000) {
			throw new InvalidAmountException("amount overtaken");
		}
	}
}
