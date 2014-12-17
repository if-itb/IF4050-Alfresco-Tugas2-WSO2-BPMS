package org.wso2.bpel.spec.scheduling;

public class ProductionSchedulingService{
	
	public void schedule(String orderId){
		System.out.println("Scheduled production for order " + orderId);
	}

}