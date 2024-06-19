package spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import spring.service.ServiceKotlin;


@RestController

@SpringBootApplication
public class Main {

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    private ServiceKotlin serviceKotlin;

    @Autowired
    public void KotlinController(ServiceKotlin serviceKotlin) {
        this.serviceKotlin = serviceKotlin;
    }

    @GetMapping("/oi")
    public String testServer() {
        System.out.println("Request");
        return serviceKotlin.nameString();
    }
}
