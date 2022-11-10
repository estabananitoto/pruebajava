package com.proyectos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proyectos.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer>{

}
