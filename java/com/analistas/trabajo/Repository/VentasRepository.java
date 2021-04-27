package com.analistas.trabajo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.analistas.trabajo.Domain.Venta;

public interface VentasRepository extends CrudRepository<Venta, Integer> {
	
}
