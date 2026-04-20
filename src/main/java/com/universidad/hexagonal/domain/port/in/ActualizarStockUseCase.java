package com.universidad.hexagonal.domain.port.in;

import com.universidad.hexagonal.domain.model.Producto;

public interface ActualizarStockUseCase {
    Producto reducirStock(Long id, int cantidad);
}
