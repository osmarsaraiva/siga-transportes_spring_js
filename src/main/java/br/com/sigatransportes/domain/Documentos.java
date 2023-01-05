package br.com.sigatransportes.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Documentos implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome_doc;
	
	
	public Documentos() {
		
	}

	
	

	@Override
	public String toString() {
		return "Documentos [id=" + id + ", nome_doc=" + nome_doc + "]";
	}





	public Documentos(Integer id, String nome_doc) {
		super();
		this.id = id;
		this.nome_doc = nome_doc;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome_doc() {
		return nome_doc;
	}


	public void setNome_doc(String nome_doc) {
		this.nome_doc = nome_doc;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Documentos other = (Documentos) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
