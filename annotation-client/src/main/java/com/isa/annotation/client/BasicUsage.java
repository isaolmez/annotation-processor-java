package com.isa.annotation.client;

public class BasicUsage {

	@Deprecated
	/**
	 * @deprecated Dont use this
	 */
	public void oldMethod(){
		
	}
	
	@Override()
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
