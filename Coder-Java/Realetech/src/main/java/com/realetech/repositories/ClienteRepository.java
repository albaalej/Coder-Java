package com.realetech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.realetech.models.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>  {

}
