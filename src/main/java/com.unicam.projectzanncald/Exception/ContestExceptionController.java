package com.unicam.projectzanncald.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ContestExceptionController {
    @ExceptionHandler(value=ContestNotExistException.class)
    public ResponseEntity<Object> exception(ContestNotExistException exception){
        return new ResponseEntity<>("Contest not exist", HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(value=ContestAlreadyInException.class)
    public ResponseEntity<Object> exception(ContestAlreadyInException exception){
        return new ResponseEntity<>("Contest already in!", HttpStatus.BAD_REQUEST);
    }
}
