package org.module.common.dataservice.statisticdataservice;

import java.rmi.Remote;
import java.rmi.RemoteException;

import org.module.common.dataservice.MyList;
import org.module.common.po.AccountPO;
import org.module.common.po.CarPO;
import org.module.common.po.DepartmentPO;
import org.module.common.po.StuffPO;
import org.module.common.po.WarehousePO;

public interface InitDateService extends Remote{

	/**
	 * 前置：选择期初建账
	 * 后置：保存期初账户信息
	 * 依赖： 
	 * @return
	 */
	public boolean init()throws RemoteException;
	/**
	 * 前置：无
	 * 选择查看期初信息
	 * 后置：返回一个arraylist
	 * 依赖：*dataService.getAll返回所有单据  
	 * @return
	 */
	public MyList<CarPO> getInitCar()throws RemoteException;
	/**
	 * 前置：无
	 * 选择查看期初信息
	 * 后置：返回一个arraylist
	 * 依赖：*dataService.getAll返回所有单据  
	 * @return
	 */
	public MyList<StuffPO> getInitStuff()throws RemoteException;
	/**
	 * 前置：无
	 * 选择查看期初信息
	 * 后置：返回一个arraylist
	 * 依赖：*dataService.getAll返回所有单据  
	 * @return
	 */
	public MyList<DepartmentPO> getInitDepartment()throws RemoteException;
	/**
	 * 前置：无
	 * 选择查看期初信息
	 * 后置：返回一个arraylist
	 * 依赖：*dataService.getAll返回所有单据  
	 * @return
	 */
	public MyList<AccountPO> getInitAccount()throws RemoteException;
	/**
	 * 前置：无
	 * 选择查看期初信息
	 * 后置：返回一个arraylist
	 * 依赖：*dataService.getAll返回所有单据  
	 * @return
	 */
	public MyList<WarehousePO> getInitWarehouse()throws RemoteException;
}
