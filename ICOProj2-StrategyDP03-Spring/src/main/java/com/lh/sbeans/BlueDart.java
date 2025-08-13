package com.lh.sbeans;

import org.springframework.stereotype.Component;

@Component("bDart")
public class BlueDart implements Courier
{
   public String deliver(int oid)
   {
	   return oid+"order items are kept for delivery by BlueDart";
   }
}
