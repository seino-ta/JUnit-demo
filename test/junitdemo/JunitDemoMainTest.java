package junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JunitDemoMainTest {

	JunitDemoMain junitDemoMain = new JunitDemoMain();
	@Test
	void testGetColorZeroIsWhite() {
		assertEquals("white", junitDemoMain.getColor(0));
	}

	@Test
	void testGetColorOneIsBlue() {
		assertEquals("blue", junitDemoMain.getColor(1));
	}

	@Test
	void testGetColorTwoIsRed() {
		assertEquals("red", junitDemoMain.getColor(2));
	}
	
	@Test
	void testGetColorThreeIsYellow() {
		assertEquals("yellow", junitDemoMain.getColor(3));
	}

	@Test
	void testGetColorDefaultIsBlack() {
		assertEquals("black", junitDemoMain.getColor(4));
		assertEquals("black", junitDemoMain.getColor(5));
		assertEquals("black", junitDemoMain.getColor(10));
		assertEquals("black", junitDemoMain.getColor(20));
		assertEquals("black", junitDemoMain.getColor(100));
		assertEquals("black", junitDemoMain.getColor(1000));
	}

}
