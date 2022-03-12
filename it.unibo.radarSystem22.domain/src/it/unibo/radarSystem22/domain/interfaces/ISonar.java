package it.unibo.radarSystem22.domain.interfaces;

public interface ISonar {
	  public void activate() throws InterruptedException;
	  public void deactivate();
	  public IDistance getDistance();
	  public boolean isActive();
}
