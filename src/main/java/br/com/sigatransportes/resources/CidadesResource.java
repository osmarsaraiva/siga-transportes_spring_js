package br.com.sigatransportes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sigatransportes.domain.Cidades;
import br.com.sigatransportes.services.CidadesService;

//ctr+shif+o
@RestController
@RequestMapping(value="/cidades")
public class CidadesResource {
	
	
	@Autowired
	private CidadesService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Cidades obj = service.find(id);
		
		return ResponseEntity.ok( ).body(obj);
	}

}