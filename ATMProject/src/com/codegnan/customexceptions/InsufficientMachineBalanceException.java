package com.codegnan.customexceptions;



public class InsufficientMachineBalanceException extends Exception {
	public InsufficientMachineBalanceException(String errorMsg) {
		super(errorMsg);
	}

}
