package com.persistence2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.persistence2.entity.Pedidos_Proveedor;


@Repository
public interface IPedidosProveedorRepository extends JpaRepository<Pedidos_Proveedor,Integer>{

  @Query("SELECT p FROM Pedidos_Proveedor p WHERE p.nombre =:name ")
  Pedidos_Proveedor findByName(@Param("name")String name);
  
  
  
}
