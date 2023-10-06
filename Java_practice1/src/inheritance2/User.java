package inheritance2;

public class User {

	public static void main(String[] args) {

		Guest G1 = new Guest();
		G1.read();

		Developer dev = new Developer();
		dev.read();
		dev.write();

		Admin A = new Admin();
		A.read();
		A.manage();
		A.write();
	}
}