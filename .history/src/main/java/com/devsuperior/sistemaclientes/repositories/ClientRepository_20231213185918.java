package com.devsuperior.sistemaclientes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.sistemaclientes.entities.Client;

public class ClientRepository extends JpaRepository<Client, Long>{
}