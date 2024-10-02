package com.abs.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlOne {

	@GetMapping("/welcome")
	public ResponseEntity<String> welCome(){
		return new ResponseEntity<String>("Hello Azam",HttpStatus.OK);
	}
}
