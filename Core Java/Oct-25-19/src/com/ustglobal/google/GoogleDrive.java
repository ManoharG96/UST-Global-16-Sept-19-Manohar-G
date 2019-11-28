package com.ustglobal.google;

public class GoogleDrive extends Google {
	@Override
	void shareDocuments() {
		System.out.println("Maximum share document size is 15GB");
	}
}
