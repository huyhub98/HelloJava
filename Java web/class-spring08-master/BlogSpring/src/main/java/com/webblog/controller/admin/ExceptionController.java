package com.webblog.controller.admin;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.NoHandlerFoundException;

@ControllerAdvice 
public class ExceptionController {
		
		private static Logger logger = Logger.getLogger(ExceptionController.class);
	
		@ExceptionHandler(value = {NoHandlerFoundException.class} )
		public String exceptionhandler(Exception exception) {
			logger.error(exception);
			return "error";
		}
}
