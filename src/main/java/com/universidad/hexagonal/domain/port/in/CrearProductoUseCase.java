package com.universidad.hexagonal.domain.port.in;

import com.universidad.hexagonal.domain.model.Producto;

public interface CrearProductoUseCase {
    Producto crear(Producto producto);
}
