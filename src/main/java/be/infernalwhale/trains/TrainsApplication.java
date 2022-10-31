package be.infernalwhale.trains;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TrainsApplication {

    public static void main(String[] args) {
        SpringApplication.run(TrainsApplication.class, args);
    }

}
