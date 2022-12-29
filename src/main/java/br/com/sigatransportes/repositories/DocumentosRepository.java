package br.com.sigatransportes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.sigatransportes.domain.Documentos;

@Repository
public interface DocumentosRepository extends JpaRepository<Documentos, Integer>{

}
