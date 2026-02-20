package br.com.soares.events.controller;

import br.com.soares.events.dto.ErrorDTO;
import br.com.soares.events.exception.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(exception = NotFoundException.class)
    public ResponseEntity<ErrorDTO> handlerNotFoundException(NotFoundException ex){
        return ResponseEntity.status(404).body(new ErrorDTO(ex.getMessage()));
    };
}
