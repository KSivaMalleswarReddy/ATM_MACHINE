package com.codegnan.cards;

import com.codegnan.customexceptions.InsufficientBalanceException;
import com.codegnan.customexceptions.InsufficientMachineBalanceException;
import com.codegnan.customexceptions.InvalidAmountException;
import com.codegnan.customexceptions.NotAOperatorException;
import com.codegnan.interfaces.IATMService;

public class OperatorCard implements IATMService {
	
	private int pinNumber;
	private long id;
	private String name;
	private final String type="operator";
	public OperatorCard(long id,int pin,String name) {
		id = id ;
		pinNumber = pin;
		this.name=name;
	}

	@Override
	public String getUserType() throws NotAOperatorException {
		// TODO Auto-generated method stub
		return type;
	}

	@Override
	public double withdrawAmount(double withAmount)
			throws InvalidAmountException, InsufficientBalanceException, InsufficientMachineBalanceException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double depositAmount(double dptAmount) throws InvalidAmountException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double checkBalance() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void changePinNumber(int pinNumber) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getPinNumber() {
		// TODO Auto-generated method stub
		return pinNumber;
	}

	@Override
	public String getUserName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public int getChances() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void decreaseChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPinChances() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getMiniStatement() {
		// TODO Auto-generated method stub
		
	}

}
