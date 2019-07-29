package com.project.calculator.power;

import static org.junit.Assert.*;

import org.junit.Test;

public class FunctionsCalTest {
	@SuppressWarnings("deprecation")
	@Test
	   public void testXPosIntegerToYPosInteger() {	
	      System.out.println("Testing positive integer to positive integer");    
	      assertEquals(Math.round(Math.pow(55,22)), Math.round(FunctionsCal.power(55,22)),0.001);   
	   }
}
