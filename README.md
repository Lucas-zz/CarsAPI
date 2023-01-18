# About

Java studies.

Implementing the `POST method` with Spring using its corresponding Annotation `@PostMapping` as well as learning more about `DTOs`, how to create, how to use and why it's used.

```java
@RestController
@RequestMapping("/api/cars")
public class CarsController {
    String cars;

    @GetMapping
    ResponseEntity<String> getCars() {
        if (cars == null) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND)
                    .body("The list of cars is empty, submit a car first.");
        }

        return ResponseEntity.status(HttpStatus.OK)
                .body("The list of cars: \n" + cars);
    }

    @PostMapping
    public void createCar(@RequestBody String req) {
        cars = req;

        System.out.println(req);
    }
}

```

# HTTP Responses and Status

### First GET when no cars were posted (Response `404 - Not Found`)

<img align="center" width="360em" height="450em" src="src\img\GET_HttpResponse_NotFound.PNG" />

### First POST (Response `200 - OK`)

<img align="center" width="360em" height="450em" src="src\img\POST_HttpResponse_Ok.PNG" />

### Second GET when the cars where posted (Response `200 - OK`)

<img align="center" width="360em" height="450em" src="src\img\GET_HttpResponse_Ok.PNG" />

# Getting Started

### Reference Documentation

For further reference, please consider the following sections:

- [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
- [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/)
- [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.0.1/maven-plugin/reference/html/#build-image)
- [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#web)
- [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.1/reference/htmlsingle/#using.devtools)

### Guides

The following guides illustrate how to use some features concretely:

- [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
- [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
- [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
