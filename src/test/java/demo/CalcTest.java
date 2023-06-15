package demo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalcTest {

	private Calc c1=null;


	@Before
	public void setUp() throws Exception {
		c1 =new Calc();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAdd() {
		assertTrue(c1.add(10, 20)==30);
	}

	@Test
	public void testDivide() {
		assertTrue(c1.divide("20", "10")==2);
	}
	@Test
	public void testDivide1() {
		try{
			c1.divide("Aa", "10");
		}catch (NumberFormatException e) {
			assertTrue(true);
		}
		
	}
	@Test
	public void testDivide2() {
		try{
			c1.divide("100", "0");
		}catch (ArithmeticException e) {
			assertTrue(true);
		}
		
	}

}
