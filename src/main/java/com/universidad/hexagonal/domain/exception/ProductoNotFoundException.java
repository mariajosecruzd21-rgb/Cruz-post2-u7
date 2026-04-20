package com.universidad.hexagonal.domain.exception;

public class ProductoNotFoundException extends RuntimeException {
    public ProductoNotFoundException(String mensaje) {
        super(mensaje);
        System.out.println("PrecioInvalidoException: " + mensaje);
    }
}
