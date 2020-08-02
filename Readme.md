curl http://localhost:8080/cities/23/
 
Response :{"timestamp":"2020-01-09T13:24:52.6727706","message":"City not found"}

curl localhost:8080/cities -H "Content-Type: application/json" -X POST -d '{"name":"Sydney", "population":"2"}'
 
Response :{"timestamp":"2020-01-09","status":400,"errors":["must be between 10 and 100000000"]}
