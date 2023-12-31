package top.zxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication(scanBasePackages = {"top.zxy"})
@EnableJpaAuditing
public class TemplateApplication {
    public static void main(String[] args) {
        SpringApplication.run(TemplateApplication.class,args);
    }
}