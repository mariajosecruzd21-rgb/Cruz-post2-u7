package com.universidad.hexagonal.domain.port.out;

import com.universidad.hexagonal.domain.model.Producto;

import java.util.List;
import java.util.Optional;

public interface ProductoRepositoryPort {
    Producto guardar(Producto producto);
    Optional<Producto> buscarPorId(Long id);
    List<Producto> buscarTodos();
    void eliminar(Long id);

}
