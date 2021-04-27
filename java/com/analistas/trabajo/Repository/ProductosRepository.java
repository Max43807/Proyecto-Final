package com.analistas.trabajo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.analistas.trabajo.Domain.Producto;

public interface ProductosRepository extends CrudRepository<Producto, Integer> {

    Producto findFirstByCodigo(String codigo);
}
