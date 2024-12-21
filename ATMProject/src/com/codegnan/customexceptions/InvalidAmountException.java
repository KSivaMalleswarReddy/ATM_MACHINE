package com.codegnan.customexceptions;

public class InvalidAmountException extends Exception {
	public InvalidAmountException(String errorMsg) {
		super(errorMsg);
	}

}
