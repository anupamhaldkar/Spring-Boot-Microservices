package com.ahdev.bookstore.orders;

import io.restassured.RestAssured;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.context.annotation.Import;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Import(TestcontainersConfiguration.class)
public abstract class AbstractIT {
    @LocalServerPort
    protected int port;

    @BeforeEach
    void setUp() {
        RestAssured.port = port;
    }
}
