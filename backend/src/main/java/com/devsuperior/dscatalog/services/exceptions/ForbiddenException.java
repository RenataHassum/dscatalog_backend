package com.devsuperior.dscatalog.services.exceptions;

public class ForbiddenException extends RuntimeException { //403

	public ForbiddenException(String msg) {
		super(msg);
	}
}

