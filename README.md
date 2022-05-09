
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
  GET /currencies/base-qoute
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `base-qoute` | `string` | **Required**. Base curency and qoute currency

Example : /currencies/usd-inr

returns US Dollar price in indian rupee


#### 2. Get Crypto Rate 

```http
  GET /crypto/base-qoute
```

| Parameter | Type     | Description                |
| :-------- | :------- | :------------------------- |
| `base-qoute` | `string` | **Required**.  crypto and qoute currency

Example : /crypto/btc-inr

returns price of bitcoin in indian rupee



# DEMO 

http://forexprices.herokuapp.com/


