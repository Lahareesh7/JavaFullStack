package com.lh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.lh.sbeans.Vehicle;

@SpringBootApplication
public class Bootproj03StrategyDpApplication {

	public static void main(String[] args) {
		//get IOC Container
		try(ConfigurableApplicationContext ctx=SpringApplication.run(Bootproj03StrategyDpApplication.class, args);){
		//get Access to target spring bean class object
			Vehicle vehicle=ctx.getBean("vehicle",Vehicle.class);
			//invoke the b.method
			vehicle.journey("Hyd","Ap");
			
			
			//close the container
			
		}
	}

}
