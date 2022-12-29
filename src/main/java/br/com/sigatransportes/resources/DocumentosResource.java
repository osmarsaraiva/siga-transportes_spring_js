package br.com.sigatransportes.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sigatransportes.domain.Documentos;


//ctr+shif+o
@RestController
@RequestMapping(value="/documentos")
public class DocumentosResource {
	
	@GetMapping
	public List<Documentos>listar() {
		
		Documentos doc = new Documentos(1, "Nota Fiscal");
		Documentos doc2 = new Documentos(2, "Recibo");
		
		List<Documentos> lista = new ArrayList<>();
		lista.add(doc);
		lista.add(doc2);
		
		return lista;
	}

}
