package org.example.turistguide_del_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "turistguide1")
public class TuristguideDel1Application {

    public static void main(String[] args) {
        SpringApplication.run(TuristguideDel1Application.class, args);
    }

}
