package it.unibo.radarSystem22.domain.utils;

import it.unibo.radarSystem22.domain.interfaces.IDistance;

public class Distance implements IDistance{
	int val;
	
	public Distance(int initialVal) {
		this.val = initialVal;
	}
	
	@Override
	public int getVal() {
		return val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
}
