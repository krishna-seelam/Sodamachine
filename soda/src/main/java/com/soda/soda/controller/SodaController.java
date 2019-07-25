package com.soda.soda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.soda.soda.service.SodaService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class SodaController {
	
	@Autowired
	private SodaService sodaService;

	@GetMapping("/insertQuarter")
	public ResponseEntity<?> insertQuarter(){
		return new ResponseEntity<Boolean>(sodaService.insertQuarter(), HttpStatus.OK);
	}
	
	@GetMapping("/removeQuarter")
	public ResponseEntity<?> removeQuarter(){
		return new ResponseEntity<Boolean>(sodaService.removeQuarter(), HttpStatus.OK);
	}
	
	@GetMapping(path = "/pushButton",produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> pushDesiredButton(){
		return new ResponseEntity<String>(sodaService.pushButton(), HttpStatus.OK);
	}
	
	@GetMapping("/currentInventoryCount")
	public ResponseEntity<?> currentInventoryCount(){
		return new ResponseEntity<Integer>(sodaService.currentInventoryCount(), HttpStatus.OK);
	}
	
}
