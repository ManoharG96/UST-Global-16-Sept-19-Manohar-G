package com.ustglobal.google;

public class Gmail extends Google {
	@Override
	void shareDocuments() {
		System.out.println("Maximum share document size is 25MB");
	}
}
