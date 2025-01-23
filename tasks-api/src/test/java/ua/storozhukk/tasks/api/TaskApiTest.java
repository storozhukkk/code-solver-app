package ua.storozhukk.tasks.api;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.web.servlet.MockMvc;
import org.testcontainers.containers.GenericContainer;
import ua.storozhukk.tasks.api.conf.IntegrationTest;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
@AutoConfigureMockMvc
class TaskApiTest extends IntegrationTest {

    @Autowired
    protected JdbcTemplate jdbcTemplate;

    @Autowired
    protected MockMvc mvc;

    @BeforeAll
    public static void setUp() {
        CONTAINERS.forEach(GenericContainer::start);
    }

    @Test
    @DisplayName("Test")
    public void test() {
    }

}
