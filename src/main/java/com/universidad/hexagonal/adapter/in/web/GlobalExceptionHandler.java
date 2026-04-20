package com.universidad.hexagonal.adapter.in.web;

import com.universidad.hexagonal.domain.exception.PrecioInvalidoException;
import com.universidad.hexagonal.domain.exception.ProductoNotFoundException;
import com.universidad.hexagonal.domain.exception.StockInsuficienteEception;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(StockInsuficienteEception.class)
    public ResponseEntity<Map<String, String>> handleStockInsuficiente(StockInsuficienteEception ex) {
        Map<String, String> response = new HashMap<>();
        response.put("error", ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(PrecioInvalidoException.class)
    public ResponseEntity<Map<String, String>> handlePrecioInvalido(PrecioInvalidoException ex) {
        Map<String, String> response = new HashMap<>();
        response.put("error", ex.getMessage());
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(response);
    }

    @ExceptionHandler(ProductoNotFoundException.class)
    public ResponseEntity<Map<String, String>> handleProductoNotFound(ProductoNotFoundException ex) {
        Map<String, String> response = new HashMap<>();
        response.put("error", ex.getMessage());
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
    }
}

