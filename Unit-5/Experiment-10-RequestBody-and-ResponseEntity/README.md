# Experiment 10 - Using @RequestBody and ResponseEntity

Demonstrates:
- `@RequestBody` for accepting JSON
- `ResponseEntity` for returning HTTP status codes and response bodies

### Test

POST `/users` with:
```json
{"id":1,"name":"Vignesh","email":"vignesh@example.com"}
```

GET `/users/status`
