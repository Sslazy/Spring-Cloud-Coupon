package top.zxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"top.zxy"})
public class CalculationApplication {
    public static void main(String[] args) {
        SpringApplication.run(CalculationApplication.class, args);
    }
}