package com.probotisop.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.probotisop.service.ForexService;

@Controller
public class MainController {
	
	@Autowired 
	ForexService service;
	
	@GetMapping("/currencies")
	public ResponseEntity<Object> getRate(@RequestParam("target") String target , @RequestParam("base") String base) throws IOException  , org.jsoup.HttpStatusException{
		
		
		if(target.length()>=4 || base.length()>=4) {
			return new ResponseEntity<Object>("Please enter currency code corectly", HttpStatus.BAD_REQUEST);
		}
		// String pass = "hahalol";
		return new ResponseEntity<Object>(service.getPrice(target, base),HttpStatus.OK);
	}
	
	@GetMapping("/crypto")
		public ResponseEntity<Object> crypto (@RequestParam("target") String target , @RequestParam("base") String base) throws IOException {
			
			
			
			// Yahoo finance has APE coin listed as APE3 , so converting user input 
			if(target.equalsIgnoreCase("ape")) {
				target = "APE3";
			}
			return new ResponseEntity<Object>(service.getCryptoPrice(target, base), HttpStatus.OK);
		}
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}

}
