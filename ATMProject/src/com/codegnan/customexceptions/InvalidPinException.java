package com.codegnan.customexceptions;

public class InvalidPinException  extends Exception {
	public InvalidPinException (String errorMsg) {
		super(errorMsg);
	}

}
