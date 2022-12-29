package br.com.sigatransportes.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//ctr+shif+o
@RestController
@RequestMapping(value="/documentos")
public class DocumentosResource {
	
	@GetMapping
	public String listar() {
		return "REST está funcionando";
	}

}
