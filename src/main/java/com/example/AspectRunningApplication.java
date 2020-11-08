package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication(scanBasePackages = "com.example.*")
@EnableAspectJAutoProxy
public class AspectRunningApplication {
    public static void main(String[] args){ SpringApplication.run(AspectRunningApplication.class,args); }
}
