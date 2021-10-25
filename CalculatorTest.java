package assignment;

import static org.junit.Assert.*;

import org.junit.Test;



public class CalculatorTest {
	
	@Test
	public void callTest() {
     assertEquals("error in add()", 3, Calculator.add(1,2));
     assertEquals("error in add1()", -3, Calculator.add(-1,-2));
     assertEquals("error in add2()", 9, Calculator.add(9,0));

	}
	@Test
	public void calcTestAddFail() {
  assertEquals("error in add3()", 3, Calculator.add(1,2));
	}
	@Test
	public void calcTestSubtPass() {
  assertEquals("error in sub()", -1, Calculator.sub(1, 2));
  assertEquals("error in sub2()", 1, Calculator.sub(-1, -2));
  assertEquals("error in sub3()", 1, Calculator.sub(2,1));
	}
	@Test
	public void calcSubFail() {
  assertEquals("error in sub1()", 1, Calculator.sub(2,1));
	}

}



  
 
