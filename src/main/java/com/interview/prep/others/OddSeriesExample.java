package com.interview.prep.others;

public class OddSeriesExample {

	public static void main(String[] args) {
		
		for(int i=1; i<10;i++){
			int pow = Integer.valueOf((int) Math.pow(i, 2));
			System.out.println(pow+3);
		}
		System.out.println("++++++++++++++++++++");
		for(int i=0;i<10;i++){
			if(i%2 != 0){
				System.out.println(i);
			}
		}
	}
}
