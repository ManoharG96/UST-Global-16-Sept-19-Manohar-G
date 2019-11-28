
public class Main3 {

	public static void main(String[] args) {
		SuperClass s = new SuperClass();
		s.count();
		System.out.println("---------------");
		ChildClass c = new ChildClass();
		c.count();
		c.add();
	}
}
