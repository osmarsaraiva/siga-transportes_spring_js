package br.com.sigatransportes.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.sigatransportes.domain.Cidades;
import br.com.sigatransportes.repositories.CidadesRepository;

@Service
public class CidadesService {
	
	@Autowired
	private CidadesRepository repo;

	public Cidades find(Integer id) {
		
		Optional<Cidades> obj = Optional.empty();
		return obj.orElse(null);
		
	}
}
