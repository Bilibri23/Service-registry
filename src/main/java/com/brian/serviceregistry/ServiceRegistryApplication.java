package com.brian.serviceregistry;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServiceRegistryApplication.class, args);

        //api gateway is used so that user will interact with microservices as one application
        //it is  like the entry point user interacts with
        //such that in case of authentication user wil not have to register over for each microservice
    }

}
