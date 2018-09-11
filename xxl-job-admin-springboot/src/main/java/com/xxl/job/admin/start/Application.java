package com.xxl.job.admin.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@Controller
@ImportResource(locations = {"classpath:spring/applicationcontext-base.xml","classpath:spring/applicationcontext-xxl-job-admin.xml","classpath:spring/springmvc-context.xml"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
