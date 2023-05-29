
This repository contains a demo application created for learning purposes. The application is a Spring Boot tutorial that focuses on writing APIs.

## Tutorial Link
This project was builded following along [this tutorial](https://www.youtube.com/watch?v=vtPkZShrvXQ&t=1381s).

## Application Structure

The application is organized into several packages representing different layers:

- `model`: Contains the `Person` class with properties such as `id` and `name`. It also includes the `uuid` field, which stands for universally unique identifier.
- `service`: Placeholder for service classes.
- `dao`: Placeholder for data access object classes.
- `api`: Contains the `PersonController` class annotated with `@RestController`. This class exposes the following endpoints:
	- `GET`: Retrieves a person's information.
	- `POST`: Creates a new person.
	- `PUT`: Updates an existing person.
	- `DELETE`: Deletes a person.

## Annotations

Annotations are extensively used in this application to facilitate dependency injection and define the behavior of various components. Here are some key annotations used:

- `@Repository`: Marks a class as a bean to be instantiated.
- `@Autowired`: Injects dependencies into classes.
- `@RestController`: Indicates that the class serves as a REST API endpoint.
- `@RequestBody`: Used to receive the JSON body of a POST request.
- `@RequestMapping`: Specifies the URL (endpoint) of a request.
- `@PostMapping`: Maps an HTTP POST request to a specific method.
- `@GetMapping`: Maps an HTTP GET request to a specific method.
- `@DeleteMapping`: Maps an HTTP DELETE request to a specific method.
- `@PutMapping`: Maps an HTTP PUT request to a specific method.
- `@NotBlank`: Validates that a field is not empty.

## Database

- It was used a fake database to test the components but I intend to create a real one ASAP.

## Testing with Postman

It was used postman to simulate the client for this application.

## Additional Resources

In addition to the tutorial mentioned above, here are some other topics that I want to see:

- **Dependency Injection**: An explanation of dependency injection is available in the [AmigosCode tutorial](https://www.youtube.com/watch?v=eQ90v7HQT-Q).
- **Java Streams**: A tutorial on Java Streams is available on [this tutorial](https://www.youtube.com/watch?v=f5j1TaJlc0w) . It covers various stream operations such as mapping and filtering. It also introduces the `Optional<>` class, which is related to functional programming.
