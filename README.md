
# Forex_Price API

Free API for getting UPDATED and LIVE forex rates




## Authors

- [@ProbotisOP](https://www.github.com/ProbotisOP)


## Features

- Simple 
- input checks
- single value return 
- fast 


## API Reference

#### 1. Get Price Rate 

```http
  GET /currencies?target=usd&base=inr
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `target-base` | `string` | **Required**. Base curency and qoute currency

Example : /currencies?target=usd&base=inr

returns US Dollar price in indian rupee


#### 2. Get Crypto Rate 

```http
  GET /crypto?target=ape&base=usd
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `target-base` | `string` | **Required**.  crypto and base currency

Example : /crypto?target=btc&base=inr

returns price of bitcoin in indian rupee



# DEMO 

http://forexprices.herokuapp.com/


