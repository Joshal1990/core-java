package oops.concepts;

class InheritanceExample {
	public int a;
	private int b;
	static int c;
	final int d ;
	
	public InheritanceExample(int y,int u,int i,int o) {
		// TODO Auto-generated constructor stub
		a = y;
		b = u;
		c = i;
		d = o;
	}
	
	public static void first(int k) {
	//b = k;
	
	}
	
	public static void main(String[] args) {
		InheritanceExample test = new InheritanceExample(2,4,5,6);
		System.out.println(test.c);
		test.first(45);
		System.out.println(c);
		
	}
}




