package it.unibo.radarSystem22.domain;

import org.junit.Before;
import org.junit.Test;

import it.unibo.radarSystem22.domain.mock.LedMock;

public class TestLed {
	
	@Before
	public void init()	{
		System.out.println("Before");
	}
	
	@Test
	public void testLedMockOn() {
		System.out.println("testLedMockOn");
		
		LedMock led = new LedMock();
		
		led.turnOn();
		assert(led.getState());		
	}
	
	@Test
	public void testLedMockOff()	{
		System.out.println("testLedMockOff");
		
		LedMock led = new LedMock();
		
		led.turnOff();
		assert(!led.getState());		
	}
	
	/*@Test
	public void testLedMockError()	{
		System.out.println("testLedMockError");
		
		LedMock led = new LedMock();
		
		led.turnOff();
		assert(led.getState());		
	}*/
}
