package br.com.sigatransportes;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.sigatransportes.domain.Documentos;
import br.com.sigatransportes.repositories.DocumentosRepository;

@SpringBootApplication
public class SigaTransportesApplication implements CommandLineRunner{
	
	@Autowired
	private DocumentosRepository documentosRepository;

	public static void main(String[] args) {
		SpringApplication.run(SigaTransportesApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Documentos doc1 = new Documentos(null, "Recibo");
		Documentos doc2 = new Documentos(null, "Nota Fiscal"); 
		
		documentosRepository.saveAll(Arrays.asList(doc1, doc2));
		
	}

}
