package com.realetech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.realetech.models.Venta;

public interface VentaRepository extends JpaRepository<Venta,Long>{
	
}
