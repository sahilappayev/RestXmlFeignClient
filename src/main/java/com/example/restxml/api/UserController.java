package com.example.restxml.api;

import com.example.restxml.client.UserClient;
import com.example.restxml.model.User;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController {

    private final UserClient userClient;

    @PostMapping()
    public ResponseEntity<User> create(@RequestBody User user) {
        log.info("Create User request: {}", user);

        ResponseEntity<User> userResponseEntity = userClient.create(user);

        log.info("Create User response: {}", userResponseEntity);
        return userResponseEntity;
    }

}
