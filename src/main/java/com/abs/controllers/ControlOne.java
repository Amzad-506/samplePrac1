package com.abs.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControlOne {

	int count =0 ;
	@GetMapping("/welcome")
	public ResponseEntity<String> welCome(){
		
		count++;
		return new ResponseEntity<String>("Hello Azam"+count ,HttpStatus.OK);
	}
}
