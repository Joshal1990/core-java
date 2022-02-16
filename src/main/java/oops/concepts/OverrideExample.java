package oops.concepts;

class One{
	public void m1() {
		// TODO Auto-generated method stub
System.out.println("1");
	}
}

class Two extends One{
	public  void m1() {
		// TODO Auto-generated method stub
System.out.println("2");
	}
}

class Three extends Two{
	public void m1() {
		// TODO Auto-generated method stub
System.out.println("3");
	}
}
public class OverrideExample{
	public static void main(String[] args) {
		One one= new Three();
		one.m1();
	}
}

