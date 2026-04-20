package com.universidad.hexagonal.domain.port.in;

import com.universidad.hexagonal.domain.model.Producto;

import java.util.List;

public interface ListarProductosUseCase {
    List<Producto> listarTodos();
    Producto buscarPorId(Long id);
}
