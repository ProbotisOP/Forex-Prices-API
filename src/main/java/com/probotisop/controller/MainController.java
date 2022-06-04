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
import org.springframework.web.bind.annotation.RestController;

import com.probotisop.service.ForexService;

@Controller
public class MainController {
	
	@Autowired 
	ForexService service;
	
	@GetMapping("/currencies/{code}")
	public ResponseEntity<Object> getRate(@PathVariable String code) throws IOException  , org.jsoup.HttpStatusException{
		String[] base = code.split("-");
		System.out.println(base[0]);
		System.out.println(base[1]);
		
		if(base[0].length()>=4 || base[1].length()>=4) {
			return new ResponseEntity<Object>("Please enter currency code corectly", HttpStatus.BAD_REQUEST);
		}
		// String pass = "hahalol";
		return new ResponseEntity<Object>(service.getPrice(base[0], base[1]),HttpStatus.OK);
	}
	
	@GetMapping("/crypto/{code}")
		public ResponseEntity<Object> crypto (@PathVariable String code) throws IOException {
			
			String[] base = code.split("-");
			System.out.println(base[0]);
			System.out.println(base[1]);
			
			// Yahoo finance has APE coin listed as APE3 , so converting user input 
			if(base[0].equalsIgnoreCase("ape")) {
				base[0] = "APE3";
			}
			return new ResponseEntity<Object>(service.getCryptoPrice(base[0], base[1]), HttpStatus.OK);
		}
	
	
	@GetMapping("/")
	public String home() {
		return "home";
	}

}
