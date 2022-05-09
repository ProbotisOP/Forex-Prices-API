package com.probotisop.service;

import java.io.IOException;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.probotisop.Exceptions.curencyCodeException;

@Service
public class ForexService {
	
	public ResponseEntity<Object> getPrice(String base , String qoute) throws IOException {
		String url = "https://in.investing.com/currencies/"+base+"-"+qoute;
		
		if(base.length()>=4 || qoute.length()>=4) {
			System.out.println("");
			throw new org.jsoup.HttpStatusException("", 0, url);
			
		}
		else {
			try {
				
				
			Document doc  = (Document) Jsoup.connect(url).get();
			
		       
		       
		       Elements element= doc.select(".last-price");
		       String[] price = element.text().split(" ");
		       System.out.println(price[0]);
		       
		    //  jsonString = { "name" : "Ronaldo", "sport" : "soccer", "age" : 25, "id" : 121, "lastScores" : [ 2, 1, 3, 5, 0, 0, 1, 1 ] }

		     //  Read more: https://www.java67.com/2016/10/3-ways-to-convert-string-to-json-object-in-java.html#ixzz7Sm3cJSjT
		       return new ResponseEntity<Object>(price[0], HttpStatus.OK);
			}
			catch (Exception e) {
			 //return "Please check you currency input ";
			 return new ResponseEntity<Object>("Please check you currency input ", HttpStatus.BAD_REQUEST);
			}
		
	}
		
		
	}
	
	public ResponseEntity<Object> getCryptoPrice(String base , String qoute) throws IOException {
		
		String url1 ="https://finance.yahoo.com/quote/"+base+"-"+qoute;
		
		if(base.length()>4 || qoute.length()>4) {
			System.out.println("");
			throw new org.jsoup.HttpStatusException("", 0, url1);
			
		}
		
		
   		System.out.println(url1);
   		 Document doc1 = Jsoup.connect(url1).get();
   		 
   		 String elements =doc1.getElementsByClass("Fw(b) Fz(36px) Mb(-4px) D(ib)").text();
   		
   		 if(elements.isEmpty()) {
   			return new ResponseEntity<Object>("Please check you Crypto CODE input ", HttpStatus.BAD_REQUEST);
   		 }
            System.out.println(elements);
   		
   		
		 return new ResponseEntity<Object>(elements, HttpStatus.OK);
		
	}

}
