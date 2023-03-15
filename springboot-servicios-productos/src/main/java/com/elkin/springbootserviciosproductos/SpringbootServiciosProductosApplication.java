package com.elkin.springbootserviciosproductos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringbootServiciosProductosApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServiciosProductosApplication.class, args);
    }

}
