package com.sagarp.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdditionController {

	@RequestMapping(method = RequestMethod.GET, value = "/addition/{firstDigit}/{secondDigit}")
	public String performAddition(@PathVariable String firstDigit, @PathVariable String secondDigit) {
		Long result = 0L;
		try {
			result = Long.parseLong(firstDigit) + Long.parseLong(secondDigit);
		} catch (Exception e) {
			return "exception occurred";
		}
		return result.toString();
	}
}
