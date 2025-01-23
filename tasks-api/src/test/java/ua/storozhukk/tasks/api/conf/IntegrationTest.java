package ua.storozhukk.tasks.api.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.GenericContainer;
import org.testcontainers.containers.PostgreSQLContainer;

import java.util.List;

public abstract class IntegrationTest {

    protected static PostgreSQLContainer<?> postgres = new PostgreSQLContainer<>("postgres:17.2")
            .withDatabaseName("testdb")
            .withUsername("postgresTest")
            .withPassword("postgresTest");

    protected static final List<GenericContainer<?>> CONTAINERS = List.of(postgres);

    @DynamicPropertySource
    protected static void configureTestDatabase(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", postgres::getJdbcUrl);
        registry.add("spring.datasource.username", postgres::getUsername);
        registry.add("spring.datasource.password", postgres::getPassword);
    }

}
