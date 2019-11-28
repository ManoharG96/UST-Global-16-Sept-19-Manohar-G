
public class Main4 {
	public static void main(String[] args) {
		Father f = new Father();
		Son s = new Son();
		Father.marry();
		Son.marry();
		f.property();
		s.property();
	}
}
