package com.lh.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle 
{
	//Has-A property
	@Autowired
	@Qualifier("dEngine")
	private IEngine engine;
	
	public Vehicle() {
		System.out.println("Vehicle::0-param constructor");
	}
	//b.method
	public void journey(String sourcePlace,String destPlace) {
		System.out.println("Vehicle.joureny()");
		engine.start();
		System.out.println("Journey started at::"+sourcePlace);
		System.out.println("Journey is going on.....");
		engine.stop();
		System.out.println("journey stopped at::"+destPlace);
	}

}
