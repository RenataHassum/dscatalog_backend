package com.devsuperior.dscatalog.services.exceptions;

public class UnauthorizedException extends RuntimeException { //401

	public UnauthorizedException(String msg) {
		super(msg);
	}
}

