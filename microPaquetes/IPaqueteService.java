package com.msPaquetes.service;

import java.util.List;


import com.persistence2.entity.Paquetes;
import com.persistence2.request.PaqueteRequest;


public interface IPaqueteService {
	List<Paquete> listar();

	Productos guardar(PaqueteRequest request);

	Productos actualizar(PaqueteRequest request);

	Productos buscar(int id);

	String eliminar(int id);

}