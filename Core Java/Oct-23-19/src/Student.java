
public class Student {
	String name;
	int rollNo;
	final String cName="Qspiders";
	final int cId=200;
	
	public Student() {	}

	public Student(String name, int rollNo, int cId) {
		this.name = name;
		this.rollNo = rollNo;
		//this.cId = cId;
	}
	
	final void printDetails() {
		System.out.println("Hi "+name+" Welcome to "+cName);
	}
	
	final void printDetails(String name) {
		System.out.println("Hi "+name+" Welcome to "+cName);
	}
}
