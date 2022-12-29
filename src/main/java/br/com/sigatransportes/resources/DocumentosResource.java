package br.com.sigatransportes.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sigatransportes.domain.Documentos;
import br.com.sigatransportes.services.DocumentosService;


//ctr+shif+o
@RestController
@RequestMapping(value="/documentos")
public class DocumentosResource {
	
	
	@Autowired
	private DocumentosService service;
	
	@GetMapping("/{id}")
	public ResponseEntity<?> find(@PathVariable Integer id) {
		
		Documentos obj = service.find(id);
		
		return ResponseEntity.ok( ).body(obj);
	}

}
