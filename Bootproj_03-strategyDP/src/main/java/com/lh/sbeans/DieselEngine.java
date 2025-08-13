package com.lh.sbeans;

import org.springframework.stereotype.Component;

@Component("dEngine")
public class DieselEngine implements IEngine
{
	public DieselEngine() {
		System.out.println("DieselEngine::0-param constructor");
	}
	//@Override
	public void start() {
		System.out.println("DieselEngine.start()::Engine started");
		
	}
	//@Override
	public void stop() {
		System.out.println("DieselEngine.stop()::Engine Stopped");
	}

}
