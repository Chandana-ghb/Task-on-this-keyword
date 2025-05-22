package com.thiskeyword;

public class Product {

	int id;
	double price;
	
	public Product(int id,double price) {
		this.id=id;
		this.price=price;
	}
	
	public boolean isSame(Product p) {
		return this.id==p.id;
	}
	
	public void test() {
		System.out.println("Product Id: "+id+"\nProduct Price: "+price);
	}
	
	public static void main(String[] args) {
		Product p=new Product(1,300.0);
		p.test();
		Product p1=new Product(2,700.0);
		p1.test();
		
		if(p.isSame(p1)) {
			System.out.println("Same Products");
		}
		else {
			System.out.println("different Products");
		}
		
	}

}
