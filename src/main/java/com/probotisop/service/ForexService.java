package com.probotisop.service;

import java.io.IOException;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import com.probotisop.Exceptions.curencyCodeException;

@Service
public class ForexService {
	
	public String getPrice(String base , String qoute) throws IOException {
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
		       return price[0];
			}
			catch (Exception e) {
			 return "Please check you currency input ";
			}
		
	}
		
		
	}
	
	public String getCryptoPrice(String base , String qoute) throws IOException {
		
		String url1 ="https://finance.yahoo.com/quote/"+base+"-"+qoute;
		
		if(base.length()>4 || qoute.length()>4) {
			System.out.println("");
			throw new org.jsoup.HttpStatusException("", 0, url1);
			
		}
		
		
   		System.out.println(url1);
   		 Document doc1 = Jsoup.connect(url1).get();
   		 
   		 String elements =doc1.getElementsByClass("Fw(b) Fz(36px) Mb(-4px) D(ib)").text();
   		
   		 if(elements.isEmpty()) {
   			return "Please Enter the Correct CRYPTO CODE";
   		 }
            System.out.println(elements);
   		
   		
		return elements ;
		
	}

}
