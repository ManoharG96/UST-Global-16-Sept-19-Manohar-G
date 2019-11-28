
public class Main9 {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.gps();
		b.gear();
		System.out.println(BMW.right);
		Toyato t = new Toyato();
		t.gps();
		t.gear();
		t.abs();
		System.out.println(Toyato.left);
	}
}
