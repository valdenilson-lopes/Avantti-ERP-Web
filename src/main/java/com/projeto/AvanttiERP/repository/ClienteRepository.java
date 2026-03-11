package com.projeto.AvanttiERP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projeto.AvanttiERP.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}