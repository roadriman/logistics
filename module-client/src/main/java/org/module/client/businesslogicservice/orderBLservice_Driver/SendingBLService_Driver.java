package org.module.client.businesslogicservice.orderBLservice_Driver;

import org.module.client.businesslogicservice.orderBLservice.SendingBLService;
import org.module.client.vo.SendingListVO;


public class SendingBLService_Driver {
	public void drive(SendingBLService sendingBLService){
		boolean result=sendingBLService.creat("date",  "shippingId", "sendMember");
		if(result)
			System.out.println("creat suuccessfully!");
	}
}
