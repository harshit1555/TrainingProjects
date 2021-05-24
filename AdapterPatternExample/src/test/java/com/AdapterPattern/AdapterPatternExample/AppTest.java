package com.AdapterPattern.AdapterPatternExample;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test 
	public void whenConvertingUSDtoEuro_thenSuccessfullyConverted() 
	{ 
		Movable europe = new Europe();
		MovableAdapter europeAdapter = new MovableAdapterImpl(bugattiVeyron); 
	 assertEquals(eAdapter.getEuro(), 8.4, 0.00001);
	}
//    @Test
//    public void shouldAnswerWithTrue()
//    {
//        assertTrue( true );
//    }
}
