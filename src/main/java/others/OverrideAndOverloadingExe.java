package others;

public class OverrideAndOverloadingExe {

	public static void main(String[] args) {
		Tow one = new Three();
		int value = one.getValue();
		System.out.println(value);
	}
}

class One {
	int getValue() {
		return 1111;
	}
}

class Tow extends One {
	/*@Override
	int getValue() {
		// TODO Auto-generated method stub
		return 2222;
	}*/
}

class Three extends Tow {
	/*@Override
	int getValue() {
		// TODO Auto-generated method stub
		return 3333;
	}*/
}

class Four extends Three {
	@Override
	int getValue() {
		// TODO Auto-generated method stub
		return 4444;
	}
}