package br.com.marcelbraghini.example.infrastructure.controller;

import br.com.marcelbraghini.example.adapters.controller.model.UserResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Component
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/v1/user", produces = MediaType.APPLICATION_JSON_VALUE)
public class SpringUserController {

    private final br.com.marcelbraghini.example.adapters.controller.UserController userController;

    @GetMapping(value = "/all")
    @ResponseStatus(HttpStatus.OK)
    public List<UserResponse> getAllUsers() {
        return userController.findAllUsers();
    }
}


