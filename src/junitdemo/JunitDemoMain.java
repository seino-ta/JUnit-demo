package junitdemo;

public class JunitDemoMain {
	public String getColor(int colorNum) {
		switch (colorNum) {
		case 0:
			return "white";
		case 1:
			return "blue";
		case 2:
			return "red";
		case 3:
			return "yellow";
		default:
			return "black";
		}
	}
}
