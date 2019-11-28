package com.ustglobal.has_a_realtion;

public class Marker {
	String colour;
	double size;
	
	
	public Marker(String colour, double size) {
		this.colour = colour;
		this.size = size;
	}


	void write() {
		System.out.println("Marker can write");
	}
}
