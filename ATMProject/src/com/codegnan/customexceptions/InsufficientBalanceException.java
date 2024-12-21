package com.codegnan.customexceptions;

public class InsufficientBalanceException extends Exception {
	public InsufficientBalanceException(String errorMsg) {
	super(errorMsg);
	}
}
