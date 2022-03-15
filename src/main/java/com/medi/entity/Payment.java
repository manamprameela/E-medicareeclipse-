package com.medi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="payment")
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="o_seq")
	@SequenceGenerator(name="o_seq",sequenceName="o_seq",allocationSize=1)
	
	@Column(name="pay_id")
	private long pid;
	@Column(name="Paid_Amount")
	private double amt;
	
	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Payment(long pid, double amt) {
		super();
		this.pid = pid;
		this.amt = amt;
	}

	public long getPid() {
		return pid;
	}

	public void setPid(long pid) {
		this.pid = pid;
	}

	public double getAmt() {
		return amt;
	}

	public void setAmt(double amt) {
		this.amt = amt;
	}

	@Override
	public String toString() {
		return "Payment [pid=" + pid + ", amt=" + amt + "]";
	} 
}
