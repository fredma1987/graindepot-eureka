package com.zhoubi.graindepot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by Administrator on 2018-12-5.
 */
@EnableEurekaServer
@SpringBootApplication
public class GraindepotEurakaApplication extends SpringBootServletInitializer {
    public static void main(String[] args) {
        SpringApplication.run(GraindepotEurakaApplication.class, args);


    }
}
