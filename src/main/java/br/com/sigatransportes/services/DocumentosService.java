package br.com.sigatransportes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sigatransportes.domain.Documentos;
import br.com.sigatransportes.repositories.DocumentosRepository;

@Service
public class DocumentosService {
	
	@Autowired
	private DocumentosRepository repo;

	public Documentos find(Integer id) {
		
		Optional<Documentos> obj = Optional.empty();
		return obj.orElse(null);
		
	}
}
