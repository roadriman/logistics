package businesslogicservice.ticketBLservice_Driver;

import vo.GoDownEntryListVO;
import businesslogicservice.ticketBLservice.GoDownEntryBLService;

public class GoDownEntryBLService_Driver {
	public void drive(GoDownEntryBLService goDownEntryBLService){
		GoDownEntryListVO d=new GoDownEntryListVO("courier","date", "destination",
				"qu", "pai","jia", "wei");
		boolean creat=goDownEntryBLService.creatTicket(d);
		boolean modify=goDownEntryBLService.modifyTicket(d);
		if(creat)
			System.out.println("creat successfully!");
		if(modify)
			System.out.println("modify successfully!");
		
	}
}
