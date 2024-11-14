package com.persistence2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence2.entity.Paquetes;


@Repository
public interface IPaqueteRepository extends JpaRepository<Paquetes,Integer>{

  @Query("SELECT p FROM Paquetes p WHERE p.nombre =:name ")
  Paquetes findByName(@Param("name")String name);
  
  
  
}
