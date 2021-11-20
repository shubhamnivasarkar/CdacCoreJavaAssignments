package com.geometry;

public class Point2D {

	private double x;
	private double y;

	public Point2D(double x, double y) {

		this.x = x;
		this.y = y;
	}
	
	
	
	public String getDetails() {
		return "x: " + x + " y: " + y;
	}

	public boolean isEqual(Point2D point) {
		return this.x == point.x && this.y == point.y;

	}

	public double calDistance(Point2D point) {
		return Math.sqrt(Math.pow(point.x - x, 2) + Math.pow(point.y - y, 2));
	}
}
