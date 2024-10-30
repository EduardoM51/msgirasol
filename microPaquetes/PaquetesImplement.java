package com.msPaquetes.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.msProductos.service.IProductoService;
import com.persistence2.entity.Productos;
import com.persistence2.repository.IProductoRepository;
import com.persistence2.request.ProductoRequest;

@Service
public class PaquetesImplement implements IPaqueteService {
	@Autowired
	IPaqueteRepository dao;

	@Override
	public List<Paquetes> listar() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public String eliminar(int id) {
		dao.deleteById(id);

		return "ELIMINADO";
	}

	@Override
	public Paquetes guardar(PaqueteRequest request) {
		Paquetes c = new Paquetes();
		c.setId_Producto_Fk(request.getId_Producto_Fk());
		c.setFecha_Alta(request.getFecha_Alta());
		c.setFecha_Recepcion(request.getFecha_Recepcion());
		c.setId_Sucursal_Fk(request.getId_Sucursal_Fk());
		

		dao.save(c);
		return null;
	}

	@Override
	public Paquetes actualizar(PaqueteRequest request) {
		Paquetes c = new Paquetes();
		c.setId_Producto_Fk(request.getId_Producto_Fk());
		c.setFecha_Alta(request.getFecha_Alta());
		c.setFecha_Recepcion(request.getFecha_Recepcion());
		c.setId_Sucursal_Fk(request.getId_Sucursal_Fk());
		
		return c;
	}

	@Override
	public Paquetes buscar(int id) {
		Paquetes c = dao.findById(id).get();
		return c;
	}

	

}
