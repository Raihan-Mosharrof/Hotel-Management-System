package com.otu.springboothotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.otu.springboothotel.model.ProvidedService;

@Repository
public interface ServiceRepository extends JpaRepository<ProvidedService, Integer> {
}
