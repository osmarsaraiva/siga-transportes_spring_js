package br.com.sigatransportes.domain;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Cidades implements Serializable{
	
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String cidade;
	private String estado;
	
	public Cidades() {
	
	}

	
	public Cidades(Integer id, String cidade, String estado) {
		super();
		this.id = id;
		this.cidade = cidade;
		this.estado = estado;
	}

		
	@Override
	public String toString() {
		return "Cidades [id=" + id + ", cidade=" + cidade + ", estado=" + estado + "]";
	}


	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	@Override
	public int hashCode() {
		return Objects.hash(cidade, estado, id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cidades other = (Cidades) obj;
		return Objects.equals(cidade, other.cidade) && Objects.equals(estado, other.estado)
				&& Objects.equals(id, other.id);
	}
	
	
	
	
	
	
}
