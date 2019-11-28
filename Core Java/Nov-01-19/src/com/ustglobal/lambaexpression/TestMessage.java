package com.ustglobal.lambaexpression;

public class TestMessage {
public static void main(String[] args) {
	
	GetMessageInterface message = ()-> {
	 System.out.println("Hello");
	 System.out.println("Lamba expression");
	return "\0";
	};
	
	String mess = message.message();
	System.out.println(mess);
}
}
