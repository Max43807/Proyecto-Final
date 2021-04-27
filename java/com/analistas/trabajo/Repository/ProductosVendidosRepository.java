package com.analistas.trabajo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.analistas.trabajo.Domain.*;

public interface ProductosVendidosRepository extends CrudRepository<ProductoVendido, Integer> {


}
