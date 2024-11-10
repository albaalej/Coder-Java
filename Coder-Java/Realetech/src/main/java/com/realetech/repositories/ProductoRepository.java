package com.realetech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.realetech.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}

