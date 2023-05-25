package com.sbai.salah.maven_spring;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Unit test for simple App.
 */
public class AppTest 
    
{
    
	
	@Test
	public void testSum() {
		App app = new App();
		int res = app.sum(2,3);
		assertEquals(5, res);
	}
	
	
	
}
