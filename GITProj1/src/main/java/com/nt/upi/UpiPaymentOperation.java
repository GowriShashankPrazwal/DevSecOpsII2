package com.nt.upi;

public class UpiPaymentOperation 
{
	//Performs the upi payment
	public String doPayment(long PhNo,double amount,String UPIid)
	{
		return amount+" Amount is paid to @phone number :: "+PhNo;
	}
}
