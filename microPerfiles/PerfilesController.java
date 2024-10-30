package com.msPerfiles.controller;

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

import com.msPerfiles.impl.PerfilesImplement;

import com.persistence2.entity.Perfiles;
import com.persistence2.request.PerfilRequest;

@RestController
@RequestMapping("/perfiles")
public class PerfilesController {
	
	@Autowired
	PerfilesImplement impl;
	
	@GetMapping("mostrar-todos")
	public ResponseEntity<List<Productos>> listar() {
		List<Perfiles> list = impl.listar();
		return new ResponseEntity<List<Productos>>(list, HttpStatus.OK);
	}
	
	// http://localhost:8090/Productos/buscar-por-id/
		@GetMapping("buscar-por-id/{id}")
		public ResponseEntity<Productos> buscar(@PathVariable int id) {
			Productos c = impl.buscar(id);
			return new ResponseEntity<Perfiles>(c, HttpStatus.OK);
		}
		
		// http://localhost:8090/Productos/guardar/
		@PostMapping("guardar")
		public ResponseEntity<Perfiles> guardar(@RequestBody ProductoRequest req) {
			Perfiles c = impl.guardar(req);
			return new ResponseEntity<Productos>(c, HttpStatus.OK);
		}
		// http://localhost:8090/Productos/actualizar
		@PutMapping("actualizar")
		public ResponseEntity<Productos> actualizar(@RequestBody ProductoRequest req) {
			Productos c = impl.actualizar(req);
			return new ResponseEntity<Perfiles>(c, HttpStatus.OK);
			}

			// http://localhost:8090/Productos/eliminar/1
			@DeleteMapping("eliminar/{id}")
			public ResponseEntity<String> eliminar(@PathVariable int id) {
				String mensaje = impl.eliminar(id);
				return new ResponseEntity<String>(mensaje, HttpStatus.OK);
			}
		}
	
		

