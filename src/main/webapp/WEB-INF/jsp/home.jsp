<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<pre style="font-size: medium;">

										DOCUMENTATION
										
			
		                                                    Free exchange rate API build by @ProbotisOP
		
	
		ENDPOINTS: 
		
		1. FOREX CURRENCIES 
		
		 GET -> /currencies/base-qoute
		
							* base -> whose rate you want
							* qoute -> in which currency correspondence you want 
							
							
		EXAMPLE : /currencies/usd-inr : return USD price in indian rupee
		          /currencies/usd-jpy : return USD price in Japanese Yen 
		          
		 
		 
		 2. CRYPTOCURRENCIES 
		 
		   
		   GET -> /crypto/base-qoute
		   
		   					* base - > CRYPTO coin 
		   					* qoute -> Native currency 
		   					
		   	
		   Example : /crypto/btc-usd  : redturns the price of bitcoin in us dollor
		   
		   
		   <b>NOTE: try to use qoute as USD only , becouse few of other currencies are not supported</b>

		       
									
							  		
</pre>

</body>
</html>