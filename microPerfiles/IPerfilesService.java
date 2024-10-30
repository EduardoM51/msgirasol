package com.msPerfiles.service;

import java.util.List;


import com.persistence2.entity.Perfiles;
import com.persistence2.request.PerfilRequest;


public interface IPerfilService {
	List<Perfiles> listar();

	Perfiles guardar(PerfilRequest request);

	Perfiles actualizar(PerfilRequest request);

	Perfiles buscar(int id);

	String eliminar(int id);

}