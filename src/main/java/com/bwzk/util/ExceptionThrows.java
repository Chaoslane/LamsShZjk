package com.bwzk.util;

import com.bwzk.pojo.SGroup;
import com.bwzk.pojo.SUser;
import com.bwzk.service.BaseService;

public class ExceptionThrows extends Exception {
	private static final long serialVersionUID = 1L;
	String errorMessage;

	public ExceptionThrows(String errorMessage)

	{

		this.errorMessage = errorMessage;

	}

	public String toString()

	{

		return errorMessage;

	}

	public String getMessage()

	{

		return errorMessage;

	}

}

