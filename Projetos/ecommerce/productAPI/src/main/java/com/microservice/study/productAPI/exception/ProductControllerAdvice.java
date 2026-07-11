package com.microservice.study.productAPI.exception;

import com.microservice.study.shoppingClient.dto.ErrorDTO;
import com.microservice.study.shoppingClient.exception.CategoryNotFoundException;
import com.microservice.study.shoppingClient.exception.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;
import java.util.List;

@ControllerAdvice
public class ProductControllerAdvice {

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ProductNotFoundException.class)
    public ErrorDTO handlerProductNotFound(ProductNotFoundException productNotFoundException) {
        ErrorDTO errorDTO = new ErrorDTO();

        errorDTO.setStatus(HttpStatus.NOT_FOUND.value());
        errorDTO.setMessage("Product not found.");
        errorDTO.setTimestamp(new Date());

        return errorDTO;
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(CategoryNotFoundException.class)
    public ErrorDTO handlerCategoryNotFound(CategoryNotFoundException categoryNotFoundException) {
        ErrorDTO errorDTO = new ErrorDTO();

        errorDTO.setStatus(HttpStatus.NO_CONTENT.value());
        errorDTO.setMessage("Category not found.");
        errorDTO.setTimestamp(new Date());

        return errorDTO;
    }

    @ResponseBody
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ErrorDTO processValidationError(MethodArgumentNotValidException methodArgumentNotValidException) {
        ErrorDTO errorDTO = new ErrorDTO();

        errorDTO.setStatus(HttpStatus.BAD_REQUEST.value());
        BindingResult result = methodArgumentNotValidException.getBindingResult();

        List<FieldError> fieldErrorList = result.getFieldErrors();

        StringBuilder stringBuilder = new StringBuilder("Invalid values to :");
        for (FieldError fieldError : fieldErrorList) {
            stringBuilder.append(" ");
            stringBuilder.append(fieldError.getField());
        }

        errorDTO.setMessage(stringBuilder.toString());
        errorDTO.setTimestamp(new Date());

        return errorDTO;
    }

}
