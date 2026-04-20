package com.universidad.hexagonal.domain.exception;

public class StockInsuficienteEception extends RuntimeException {
    public StockInsuficienteEception(String mensaje) {
        super(mensaje);
        System.out.println("StockInsuficienteEception" +  mensaje);
    }
}
