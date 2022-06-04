package com.probotisop.service;

import java.io.IOException;
import java.security.Timestamp;
import java.sql.Time;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Date;
import java.util.Timer;

import org.jsoup.HttpStatusException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.probotisop.Exceptions.curencyCodeException;
import com.probotisop.entity.Coin;

@Service
public class ForexService {
	
	public ForexService() {
		
	}

	public ResponseEntity<Coin> getPrice(String base, String qoute) throws IOException {
		String url = "https://in.investing.com/currencies/" + base + "-" + qoute;
		
		

		if (base.length() >= 4 || qoute.length() >= 4) {
			System.out.println("");
			throw new org.jsoup.HttpStatusException("", 0, url);

		} else {
			try {

				Document doc = (Document) Jsoup.connect(url).get();

				Elements element = doc.select(".last-price");
				String[] price = element.text().split(" ");
				System.out.println(price[0]);
				
				LocalTime time = LocalTime.now();
				Coin coin = new Coin(time, base.toUpperCase(), qoute.toUpperCase(), price[0]);

				return new ResponseEntity<Coin>(coin, HttpStatus.OK);
			} catch (Exception e) {
				// return "Please check you currency input ";
				return new ResponseEntity<Coin>(HttpStatus.BAD_REQUEST);
			}

		}

	}

	public ResponseEntity<Object> getCryptoPrice(String base, String qoute) throws IOException {

		String url1 = "https://finance.yahoo.com/quote/" + base + "-" + qoute;

		if (base.length() > 4 || qoute.length() > 4) {
			System.out.println("");
			throw new org.jsoup.HttpStatusException("", 0, url1);

		}

		System.out.println(url1);
		Document doc1 = Jsoup.connect(url1).get();

		String elements = doc1.getElementsByClass("Fw(b) Fz(36px) Mb(-4px) D(ib)").text();

		if (elements.isEmpty()) {
			return new ResponseEntity<Object>("Please check you Crypto CODE input ", HttpStatus.BAD_REQUEST);
		}
		
		LocalTime time = LocalTime.now();
		Coin coin = new Coin(time, base.toUpperCase(), qoute.toUpperCase(), elements);
		System.out.println(elements);

		return new ResponseEntity<Object>(coin, HttpStatus.OK);

	}
	
	

}
