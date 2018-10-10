package com.gmail.manjko;

public class LineRunner {

	public static void main(String[] args) {
		
		Point a = new Point(1, 3);
		Point b = new Point(2, 5);
		Point c = new Point(4, 7);
		
		Line l1 = new Line(a, b);
		Line l2 = new Line(a, c);
		Line l3 = new Line(b, c);
		
		Lines one = new Lines();
		one.addLine(l1);
		one.addLine(l2);
		one.addLine(l3);
		
		System.out.println(one.sumLengh());
		
		System.out.println(one.getMaxLenghLine().getLength());

	}

}
