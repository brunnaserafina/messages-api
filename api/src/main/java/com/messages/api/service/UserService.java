package com.messages.api.service;

import com.messages.api.dto.UserDTO;
import com.messages.api.error.InvalidImageException;
import com.messages.api.error.UsernameAlreadyExistsException;
import com.messages.api.model.User;
import com.messages.api.repository.UserRepository;
import com.messages.api.validation.ImageValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.imageio.ImageIO;

@Service
public class UserService {

    @Autowired
    private UserRepository repository;

    private ImageValidator imageValidator = new ImageValidator();

    public void save(UserDTO dto) {

        if (repository.existsByUsername(dto.username())) {
            throw new UsernameAlreadyExistsException("O username já está sendo utilizado!");
        }

        if (!imageValidator.isImage(dto.avatar())) {
            throw new InvalidImageException("O link fornecido não é uma imagem");
        }

        repository.save(new User(dto));
    }
}
