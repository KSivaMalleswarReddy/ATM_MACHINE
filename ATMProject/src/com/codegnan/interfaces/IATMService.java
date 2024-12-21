package com.codegnan.interfaces;

import com.codegnan.customexceptions.InsufficientBalanceException;
import com.codegnan.customexceptions.InsufficientMachineBalanceException;
import com.codegnan.customexceptions.InvalidAmountException;
import com.codegnan.customexceptions.NotAOperatorException;

public interface IATMService {
	
	public abstract String getUserType() throws NotAOperatorException;
	
	public abstract double withdrawAmount(double withAmount)throws InvalidAmountException,InsufficientBalanceException,InsufficientMachineBalanceException;
	
//	to deposit Amount
	public abstract double depositAmount(double dptAmount)throws InvalidAmountException;
	
//	to check Balance
	public abstract double checkBalance();
	
//	Change Pin Number
	public abstract void changePinNumber(int pinNumber);
	
//	to get pin number
	public abstract int getPinNumber();
	
//	to get user Name
	public abstract String getUserName();
//	to get changes in pin
	public abstract int getChances();
//	
	public abstract void decreaseChances();
	
	public abstract void resetPinChances();
	
//	to get the ministatement of an account
	public abstract void getMiniStatement();
	
}
