package calculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCalculator {

	@Test
	public void testmax() {
		Calculator c=new Calculator();
		
		assertEquals(4,c.findMax(2, 3, 4));
		
		
	}
	
	@Test
	public void testmax1() {
		Calculator c=new Calculator();
		
		assertEquals(-5,c.findMax(-3, -4, -5));
		
		
	}
	@Test
	public void testmax2() {
		Calculator c=new Calculator();
		
		assertEquals(0,c.findMax(0, 0, 0));
		
		
	}
	
	
	@Test
	public void testsquare() {
		Calculator c=new Calculator();
		
		assertEquals(4,c.square(4));
		
		
	}
	
	@Test
	public void testsquare1() {
		Calculator c=new Calculator();
		
		assertEquals(3,c.square(1));
		
		
	}

}
