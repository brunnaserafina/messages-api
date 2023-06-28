package com.messages.api.controller;

import com.messages.api.dto.UserDTO;
import com.messages.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/auth/sign-up")
public class UserController {

    @Autowired
    private UserService service;

    @PostMapping
    @ResponseStatus(code = HttpStatus.OK)
    public void createUser(@RequestBody UserDTO req) {
        service.save(req);
    }
}
