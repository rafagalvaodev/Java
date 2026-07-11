package com.microservice.study.ecommerce.exception;

import com.microservice.study.shoppingClient.dto.ErrorDTO;
import com.microservice.study.shoppingClient.exception.UserNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

@ControllerAdvice
public class UserControllerAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(UserNotFoundException.class)
    public ErrorDTO handleUserNotFound(UserNotFoundException userNotFoundException) {
        ErrorDTO errorDTO = new ErrorDTO();

        errorDTO.setStatus(HttpStatus.NOT_FOUND.value());
        errorDTO.setMessage("User not found.");
        errorDTO.setTimestamp(new Date());

        return errorDTO;
    }
}
