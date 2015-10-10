package com.labouardy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

@Controller
public class ExceptionController {

	@ExceptionHandler(NullPointerException.class)
	public String nullException(){
		return "error";
	}
}
