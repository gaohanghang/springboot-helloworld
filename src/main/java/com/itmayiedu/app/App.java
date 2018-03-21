package com.itmayiedu.app;

import com.itmayiedu.controller.IndexController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.itmayiedu.controller","com.itmayiedu.service"})
@EnableAutoConfiguration
public class App {

    public static void main(String[] args) {
        //主函数运行springboot项目
        SpringApplication.run(App.class, args);
    }
}
