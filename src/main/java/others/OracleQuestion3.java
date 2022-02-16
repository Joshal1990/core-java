package others;

class Feline {
	public String type = "f ";

	public Feline() {
		System.out.print("feline ");
	}
}

public class OracleQuestion3 extends Feline {
	public OracleQuestion3() {
		System.out.print("OracleQuestion3 ");
	}

	void go() {
		type = "c ";
		System.out.println(this.type + super.type);
		System.out.println(this.type.equals(super.type));
	}

	public static void main(String[] args) {
		new OracleQuestion3().go();
	}
}
