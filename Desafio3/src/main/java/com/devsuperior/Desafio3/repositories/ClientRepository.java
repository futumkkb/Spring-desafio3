package com.devsuperior.Desafio3.repositories;

import com.devsuperior.Desafio3.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
}
