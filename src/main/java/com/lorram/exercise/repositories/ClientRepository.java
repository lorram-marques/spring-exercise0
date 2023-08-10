package com.lorram.exercise.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lorram.exercise.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {

}
