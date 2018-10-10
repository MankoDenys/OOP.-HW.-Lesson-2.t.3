package com.gmail.manjko;

public class Line {
	private Point a;
	private Point b;

	public Line(Point a, Point b) {
		super();
		this.a = a;
		this.b = b;
	}

	public Point getA() {
		return a;
	}

	public Point getB() {
		return b;
	}

	public double getLength() {

		double length = Math.sqrt(b.getX() - a.getX())
				+ Math.sqrt(b.getY() - a.getY());

		return length;
	}

	public String toString() {
		return "Line [a=" + a + ", b=" + b + "]";
	}
}
