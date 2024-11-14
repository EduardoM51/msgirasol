package com.persistence2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence2.entity.Perfiles;


@Repository
public interface IPerfilRepository extends JpaRepository<Perfiles,Integer>{

  @Query("SELECT p FROM Perfiles p WHERE p.nombre =:name ")
  Perfies findByName(@Param("name")String name);
  
  
  
}
