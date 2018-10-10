package com.gmail.manjko;

import java.util.ArrayList;

public class Lines {
	private  ArrayList<Line> lines = new ArrayList<>();
	
	public void addLine(Line line) {
		lines.add(line);
	}

	public double sumLengh() {
		double sumLengh = 0;
		for(Line i:lines) {
			sumLengh += i.getLength();
		}
		return sumLengh;
	}
	
	public Line getMaxLenghLine() {
		double longest = lines.get(0).getLength();
		Line max = lines.get(0);
		for(Line i:lines) {
			if(i.getLength()>longest) {
				max=i;
			}
		}
		return max;
	}
}
