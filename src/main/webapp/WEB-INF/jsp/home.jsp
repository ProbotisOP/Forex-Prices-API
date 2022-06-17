<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Documentation </title>


</head>
<body>

<pre style="font-size: medium;">

										DOCUMENTATION
										
			
		                                                    Free exchange rate API build by @ProbotisOP
		
	
	<h3>	ENDPOINTS:  </h3>
		
		
		<b> 1. CRYPTOCURRENCIES </b>
		 
		   
		   GET -> /crypto?target=ape&base=usd
		   
		   					* target - > CRYPTO coin 
		   					* base -> Native currency 
		   					
		   	
		   Example : /crypto?target=ape&base=usd  : returns the price of bitcoin in us dollor
		   
		   
		   <b>NOTE: try to use qoute as USD only , becouse few of other currencies are not supported</b>
		   
		   

		   
		   
		<b>2. FOREX CURRENCIES </b> 
		
		 GET -> /currencies?target=usd&base=inr
		
							* target -> whose rate you want
							* base -> in which currency correspondence you want 
							
							
		EXAMPLE : /currencies?target=usd&base=inr : return USD price in indian rupee
		          /currencies?target=usd&base=jpy : return USD price in Japanese Yen 
		          
		          
		        
		
							follow me :		<a href="https://github.com/ProbotisOP" target="blank">GithuB</a>
									
							  		
</pre>
</div>

</body>
</html>