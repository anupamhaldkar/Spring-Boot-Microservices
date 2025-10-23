# Spring Boot Microservices

This repository contains a collection of microservices built using Spring Boot. The goal is to demonstrate the development, deployment, and orchestration of distributed microservices architectures using popular Java frameworks and tools.

## Features

- Modular microservices architecture
- RESTful APIs for each service
- Centralized configuration
- Service discovery and registration
- Inter-service communication
- Fault tolerance and resilience
- API gateway integration
- Distributed tracing and monitoring

## Tech Stack

- **Java** (Spring Boot)
- **Spring Cloud** (Eureka, Config Server, Gateway, etc.)
- **Docker** (for containerization)
- **Maven** (build tool)
- **PostgreSQL/MySQL** (databases; can be switched per service)
- **RabbitMQ/Kafka** (optional, for messaging)
- **Sleuth & Zipkin** (distributed tracing)

## Typical Architecture

```
[Client] 
   |
[API Gateway]
   |
[Microservice 1] -- [Database 1]
[Microservice 2] -- [Database 2]
   |
[Discovery Service] <-> [Config Server]
```

## Microservices Included

- **Service Registry (Eureka)**
- **API Gateway**
- **Config Server**
- **Sample Business Services** (e.g., User, Order, Product, etc.)

## Getting Started

### Prerequisites

- Java 17+ (or as specified in `pom.xml`)
- Maven
- Docker (optional, for containerization)

### Running Locally

1. **Clone the repository:**
    ```bash
    git clone https://github.com/anupamhaldkar/Spring-Boot-Microservices.git
    cd Spring-Boot-Microservices
    ```

2. **Start Config Server and Eureka Server first:**
    ```bash
    cd config-server
    mvn spring-boot:run
    # In a new terminal
    cd ../eureka-server
    mvn spring-boot:run
    ```

3. **Start other microservices:**
    ```bash
    cd ../<microservice-name>
    mvn spring-boot:run
    ```

4. **Access API Gateway:**
    - Default: `http://localhost:8080`

### Docker Compose

If a `docker-compose.yml` is provided:
```bash
docker-compose up --build
```

## Configuration

- Configuration properties for services are usually managed by the Config Server.
- Update configuration files in the `/config-repo` or as specified.

## Monitoring & Tracing

- Distributed tracing with Spring Cloud Sleuth and Zipkin.
- Health checks and metrics exposed at `/actuator`.

## Contributing

Pull requests are welcome! For major changes, please open an issue first to discuss what you would like to change.

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/fooBar`)
3. Commit your changes (`git commit -am 'Add some fooBar'`)
4. Push to the branch (`git push origin feature/fooBar`)
5. Create a new Pull Request

## License

This project is licensed under the MIT License.

---

*Happy Coding n Developing!*
