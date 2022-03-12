package it.unibo.radarSystem22.domain;

import org.junit.Before;
import org.junit.Test;

import it.unibo.radarSystem22.domain.mock.SonarMock;
import junit.framework.Assert;

public class TestSonar {
	@Before
	public void init()	{
		System.out.println("Before");
	}	
	
	@Test
	public void testSonarDistance() throws InterruptedException {
		System.out.println("testSonarDistance");
		SonarMock sonar = new SonarMock();
		sonar.activate();
		int val = sonar.getDistance().getVal();
		Assert.assertEquals(val, 0);
	}
}
