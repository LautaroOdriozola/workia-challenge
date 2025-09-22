
# Order Management API

This project is a simple Spring Boot application to manage customer orders. Orders are stored in memory, and the API calculates the total order amount and returns a summary including the creation date.


## Tech Stack

Java 21

Spring Boot

Maven


## Run Locally

Clone the project

```bash
  git clone https://github.com/LautaroOdriozola/workia-challenge.git
```

Go to the project directory

```bash
  cd workia-challenge
```

Install dependencies

```bash
  mvn clean install
```

Start the server

```bash
  mvn spring-boot:run
```

By default, the application runs on http://localhost:8080


## API Reference

#### Create Order

```http
  POST /order
```
Request Body (JSON)
```
{
  "customer": {
    "name": "Alice",
    "email": "alice@example.com"
  },
  "products": [
    { "name": "Keyboard", "unitPrice": 50.0, "quantity": 2 },
    { "name": "Monitor", "unitPrice": 200.0, "quantity": 1 }
  ]
}
```

Response Body (JSON)
```
{
  "totalOrder": 300.0,
  "dateCreated": "2025-09-21T23:59:00Z"
}
```
