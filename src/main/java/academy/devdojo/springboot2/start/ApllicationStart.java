package academy.devdojo.springboot2.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan(basePackages = "academy.devdojo.springboot2")
public class ApllicationStart {

    public static void main(String[] args) {

        SpringApplication.run(ApllicationStart.class, args);
    }

}
