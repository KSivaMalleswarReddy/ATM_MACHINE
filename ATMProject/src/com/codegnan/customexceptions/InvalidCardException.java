package com.codegnan.customexceptions;

public class InvalidCardException extends Exception {
	public InvalidCardException(String errorMsg) {
		super(errorMsg);
	}

}
