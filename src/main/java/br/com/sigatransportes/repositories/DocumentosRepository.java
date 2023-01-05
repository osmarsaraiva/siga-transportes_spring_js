package br.com.sigatransportes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;


import br.com.sigatransportes.domain.Documentos;


public interface DocumentosRepository extends JpaRepository<Documentos, Integer>{

}
