package it.unibo.radarSystem22.domain.mock;

import it.unibo.radarSystem22.domain.interfaces.IDistance;
import it.unibo.radarSystem22.domain.interfaces.ISonar;
import it.unibo.radarSystem22.domain.utils.Distance;

public class SonarMock implements ISonar {
	private Distance dist;
	private boolean active;
	
	public SonarMock() {
		this.dist = new Distance(90);
		this.active = false;
	}

	@Override
	public void activate() throws InterruptedException {
		this.active = true;
		for(int i=90;i>=0;i--)	{
			dist.setVal(i);
			System.out.println("SonarMock Distance:" + dist.getVal());
			try
			{
			    Thread.sleep(250);
			}
			catch(InterruptedException ex)
			{
			    Thread.currentThread().interrupt();
			}
		}
		
	}

	@Override
	public void deactivate() {
		this.active = false;
		
	}

	@Override
	public IDistance getDistance() {
		return this.dist;
	}

	@Override
	public boolean isActive() {
		return this.active;
	}

}
