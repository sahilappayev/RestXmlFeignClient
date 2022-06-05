package com.example.restxml.client;

import com.example.restxml.model.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.xml.bind.JAXBContextFactory;

@FeignClient(
        name = "user-service",
        url = "http://localhost:8081/users")
public interface UserClient {


    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
    ResponseEntity<User> create(@RequestBody User user);

}
