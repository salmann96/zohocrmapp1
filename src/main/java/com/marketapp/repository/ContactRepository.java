package com.marketapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketapp.entities.contacts;

public interface ContactRepository extends JpaRepository<contacts, Long>{

}
