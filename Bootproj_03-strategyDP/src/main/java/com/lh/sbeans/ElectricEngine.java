package com.lh.sbeans;

import org.springframework.stereotype.Component;

@Component("eEngine")
public class ElectricEngine implements IEngine{
  public ElectricEngine() {
	  System.out.println("ElectricEngine::0-param constructor");
	  
  }
  public void start() {
	  System.out.println("ElectricEngine()::Engine Started");
  }
  public void stop() {
	  System.out.println("ElectricEngine()::Engine Stopped");
  }
}
