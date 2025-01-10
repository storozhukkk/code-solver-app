package ua.storozhukk.solutions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class SolutionsApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(SolutionsApiApplication.class, args);
    }

}
