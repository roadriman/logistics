package org.module.common.po.salary;

import java.io.Serializable;

public class OfficeClerkSalaryPO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -3795145263202458688L;
	/**
	 * 底薪
	 */
	private double base;  
	/**
	 * 派件提成
	 */
	private double bonusEveryDelivered;
	/**
	 * 收件提成
	 */
	private double bonusEveryReceive;
	
	
	
	private String split=":%:%:";
	@Override
	public String toString(){
		return this.base+this.split
				+this.bonusEveryDelivered+
				this.split+this.bonusEveryDelivered;
	}
	public OfficeClerkSalaryPO(String str){
		super();
		String[] strs=str.split(this.split);
		this.base = Double.parseDouble(strs[0]);
		this.bonusEveryDelivered = Double.parseDouble(strs[1]);
		this.bonusEveryReceive = Double.parseDouble(strs[2]);
	}
	
	
	public OfficeClerkSalaryPO(double base, double bonusEveryDelivered,
			double bonusEveryReceive) {
		super();
		this.base = base;
		this.bonusEveryDelivered = bonusEveryDelivered;
		this.bonusEveryReceive = bonusEveryReceive;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getBonusEveryDelivered() {
		return bonusEveryDelivered;
	}
	public void setBonusEveryDelivered(double bonusEveryDelivered) {
		this.bonusEveryDelivered = bonusEveryDelivered;
	}
	public double getBonusEveryReceive() {
		return bonusEveryReceive;
	}
	public void setBonusEveryReceive(double bonusEveryReceive) {
		this.bonusEveryReceive = bonusEveryReceive;
	}
	

}
