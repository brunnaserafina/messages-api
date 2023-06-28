package com.messages.api.service;

import com.messages.api.dto.UserDTO;
import com.messages.api.model.User;
import com.messages.api.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    public void save(UserDTO dto) {
        repository.save(new User(dto));
    }
}
