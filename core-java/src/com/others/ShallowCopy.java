package com.others;

public class ShallowCopy {

	public static void main(String[] args) {
		Emply emply = new Emply("velacher", "chennai");
		Stdnt stdnt = new Stdnt("john", "45", emply);
		Stdnt stdnt2 = null;
		try {
			stdnt2 = (Stdnt) stdnt.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(stdnt.name + " first " + stdnt.age + ""
				+ stdnt.emplye.adrs);
		System.out.println(stdnt2.name + " second " + stdnt2.age + ""
				+ stdnt2.emplye.adrs);
		stdnt2.emplye.adrs = "welcome";
		System.out.println(stdnt.name + " first " + stdnt.age + ""
				+ stdnt.emplye.adrs);
		System.out.println(stdnt2.name + " second " + stdnt2.age + ""
				+ stdnt2.emplye.adrs);
	}

}

class Stdnt implements Cloneable {
	String name;
	String age;
	Emply emplye;

	public Stdnt(String name, String age, Emply emply) {
		this.name = name;
		this.age = age;
		this.emplye = emply;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		Stdnt std = (Stdnt) super.clone();
		std.emplye = (Emply) emplye.clone();
		return std;
	}
}

class Emply implements Cloneable {
	String adrs;
	String plce;

	public Emply(String adrs, String plce) {
		super();
		this.adrs = adrs;
		this.plce = plce;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
