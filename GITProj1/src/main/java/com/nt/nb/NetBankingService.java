package com.nt.nb;

public class NetBankingService 
{
	//Bt default performs RTGS Payment
	public String transferMoney(long srcAccpount,long destAccount,long amount)
	{
		//Perform the UPI Payment
		return amount+" is transfering from "+srcAccpount+" to   "+destAccount;
	}
}
