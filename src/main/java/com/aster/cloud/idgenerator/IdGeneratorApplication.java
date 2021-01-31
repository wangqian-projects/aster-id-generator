package com.aster.cloud.idgenerator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author 王骞
 * @date 2020-10-31
 */
@EnableDiscoveryClient
@SpringBootApplication
public class IdGeneratorApplication {
    public static void main(String[] args) {
        SpringApplication.run(IdGeneratorApplication.class, args);
    }
}
