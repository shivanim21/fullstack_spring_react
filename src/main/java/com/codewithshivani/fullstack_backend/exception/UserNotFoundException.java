package com.codewithshivani.fullstack_backend.exception;
import com.codewithshivani.fullstack_backend.exception.UserNotFoundException;

@SuppressWarnings("serial")
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
