package com.marketapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketapp.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
