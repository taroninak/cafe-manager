package tk.taroninak.cafe.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import tk.taroninak.cafe.domain.ErrorDto;

@ControllerAdvice
public class ExceptionController {
    @ExceptionHandler(value = { Exception.class })
    protected ResponseEntity<ErrorDto> handleConflict(RuntimeException ex, WebRequest request) {
        return ResponseEntity.status(500).body(new ErrorDto());
    }
}
