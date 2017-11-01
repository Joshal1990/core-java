package com.others;

class Product {

	private int id;
	public Product(int id) {
		this.id=id;
	}
	@Override
	public int hashCode() {
		/*final int prime = 31;
		int result = 1;
		result = prime * result + id;*/
		return id+42;
	}
	@Override
	public boolean equals(Object obj) {
		return(this == obj) ? true : super.equals(obj);
		/*if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (id != other.id)
			return false;
		return true;*/
	}
	
	
}

public class OracleQuestion18 {

	public static void main(String[] args) {
		Product product1 = new Product(10);
		Product product2 = new Product(10);
		Product product3 = new Product(20);
		System.out.println(product1.equals(product2)+" and "+ product1.equals(product3));
	}
}



