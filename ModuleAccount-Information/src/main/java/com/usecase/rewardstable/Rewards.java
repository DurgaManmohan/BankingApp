package com.usecase.rewardstable;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Rewards {
	
	    @Id
	    private String userid;
	    private int rewardsaccountid;
	 	private int rewardsbalance;
	 	private String rewardstype;
	 	private String rewardsredeemstatus;
	 	private String rewardsexpiry;
		public String getUserid() {
			return userid;
		}
		public void setUserid(String userid) {
			this.userid = userid;
		}
		public int getRewardsaccountid() {
			return rewardsaccountid;
		}
		public void setRewardsaccountid(int rewardsaccountid) {
			this.rewardsaccountid = rewardsaccountid;
		}
		public int getRewardsbalance() {
			return rewardsbalance;
		}
		public void setRewardsbalance(int rewardsbalance) {
			this.rewardsbalance = rewardsbalance;
		}
		public String getRewardstype() {
			return rewardstype;
		}
		public void setRewardstype(String rewardstype) {
			this.rewardstype = rewardstype;
		}
		public String getRewardsredeemstatus() {
			return rewardsredeemstatus;
		}
		public void setRewardsredeemstatus(String rewardsredeemstatus) {
			this.rewardsredeemstatus = rewardsredeemstatus;
		}
		public String getRewardsexpiry() {
			return rewardsexpiry;
		}
		public void setRewardsexpiry(String rewardsexpiry) {
			this.rewardsexpiry = rewardsexpiry;
		}
	 	
	  

}
