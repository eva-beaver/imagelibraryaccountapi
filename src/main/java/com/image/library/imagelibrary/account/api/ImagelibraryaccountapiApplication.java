package com.image.library.imagelibrary.account.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ImagelibraryaccountapiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ImagelibraryaccountapiApplication.class, args);
    }

}
