package com.thiskeyword;

public class Point {
	
	int x;
	int y;
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	public void print() {
		System.out.println("Point x: "+this.x+"\nPoint y: "+this.y);
		System.out.println(this);
	}

	public static void main(String[] args) {
		Point p=new Point(20,30);
		p.print();
//		System.out.println(p.toString());
	
	}
}
