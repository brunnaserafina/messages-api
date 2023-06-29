package com.messages.api.error;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.CONFLICT)
public class UsernameAlreadyExistsException extends IllegalArgumentException {
    public UsernameAlreadyExistsException(String message) {
        super(message);
    }
}
