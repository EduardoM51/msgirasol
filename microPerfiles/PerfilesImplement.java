package com.msPerfiles.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msProductos.service.IProductoService;
import com.persistence2.entity.Productos;
import com.persistence2.repository.IProductoRepository;
import com.persistence2.request.ProductoRequest;

@Service
public class PerfilesImplement implements IPerfilService {
	@Autowired
	IPerfilRepository dao;

	@Override
	public List<Perfiles> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public String eliminar(int id) {
		dao.deleteById(id);

		return "ELIMINADO";
	}

	@Override
	public Perfiles guardar(PerfilRequest request) {
		Perfiles c = new Perfiles();
		c.setId_Empleado_Fk(request.getId_Empleado_Fk());
		c.setDescripcion(request.getDescripcion());
		
		

		dao.save(c);
		return null;
	}

	@Override
	public Perfiles actualizar(PerfilRequest request) {
		Perfiles c = new Perfiles();
		c.setId_Empleado_Fk(request.getId_Empleado_Fk());
		c.setDescripcion(request.getDescripcion());
		return c;
	}

	@Override
	public Perfiles buscar(int id) {
		Perfiles c = dao.findById(id).get();
		return c;
	}

	

}
