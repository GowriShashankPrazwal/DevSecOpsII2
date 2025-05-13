package com.nt.nb;

public class NetBankingService 
{
	public String transferMoney(long srcAccpount,long destAccount,long amount)
	{
		return amount+" is transfering from "+srcAccpount+" to "+destAccount;
	}
}
