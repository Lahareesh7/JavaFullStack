package lh.ICOProj2_StrategyDP03_Spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.lh.sbeans.Flipkart;
import com.ln.cfgs.AppConfig;

public class StrategyDPTest 
{
	public static void main(String[]args)
	{
		//create IOC container
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(AppConfig.class);
		//get target spring bean class obj
		Flipkart fpkt=ctx.getBean("fpkt",Flipkart.class);
		//invoke the B.methods
		String resultMsg=fpkt.shopping(new String[]{"shirt","trouser"},new float[]{60000.0f,70000.0f});
		System.out.println(resultMsg);
		  
		ctx.close();
	}
	

}
