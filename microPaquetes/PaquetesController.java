package com.msPaquetes.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.msPaquetes.impl.PaquetesImplement;

import com.persistence2.entity.Productos;
import com.persistence2.request.ProductoRequest;

@RestController
@RequestMapping("/paquetes")
public class PaquetesController {
	
	@Autowired
	ProductosImplement impl;
	
	@GetMapping("mostrar-todos")
	public ResponseEntity<List<Paquetes>> listar() {
		List<Paquetes> list = impl.listar();
		return new ResponseEntity<List<Paquetes>>(list, HttpStatus.OK);
	}
	
	// http://localhost:8090/Paquetes/buscar-por-id/
		@GetMapping("buscar-por-id/{id}")
		public ResponseEntity<Paquetes> buscar(@PathVariable int id) {
			Productos c = impl.buscar(id);
			return new ResponseEntity<Paquetes>(c, HttpStatus.OK);
		}
		
		// http://localhost:8090/Paquetes/guardar/
		@PostMapping("guardar")
		public ResponseEntity<Productos> guardar(@RequestBody ProductoRequest req) {
			Paquetes c = impl.guardar(req);
			return new ResponseEntity<Paquetes>(c, HttpStatus.OK);
		}
		// http://localhost:8090/Paquetes/actualizar
		@PutMapping("actualizar")
		public ResponseEntity<Productos> actualizar(@RequestBody ProductoRequest req) {
			Paquetes c = impl.actualizar(req);
			return new ResponseEntity<Paquetes>(c, HttpStatus.OK);
			}

			// http://localhost:8090/Paquetes/eliminar/1
			@DeleteMapping("eliminar/{id}")
			public ResponseEntity<String> eliminar(@PathVariable int id) {
				String mensaje = impl.eliminar(id);
				return new ResponseEntity<String>(mensaje, HttpStatus.OK);
			}
		}
	
		

