package com.others;

interface Ride {
	String abc="abc";
	abstract String getRide();
}

class HorseRide implements Ride {
	public String getRide() {
		return " H ";
	}
}

class BikeRide extends HorseRide {
	public String getRide() {
		return " B ";
	}
}

public class OracleQuestion19 {
	public static void main(String[] args) {
		Ride ride1 = new BikeRide();
		Ride ride2 = new HorseRide();
		HorseRide ride3 = new BikeRide();
		System.out.println(ride1.getRide() + ride2.getRide() + ride3.getRide());
	}
}
