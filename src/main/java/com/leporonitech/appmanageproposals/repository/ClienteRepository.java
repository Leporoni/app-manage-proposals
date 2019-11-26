package com.leporonitech.appmanageproposals.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leporonitech.appmanageproposals.model.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long>  {

}
