package br.com.sigatransportes.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Clientes implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private String CNPJ;
	private String ie;
	private String email;
	private String endereco;
	private String telefone;
	private Date dataCadastro;
	
	private List<Cidades> cidades = new ArrayList<>();



	public Clientes() {
		
	}
	
	
	public Clientes(Integer id, String nome, String cNPJ, String ie, String email, String endereco, String telefone,
			Date dataCadastro) {
		super();
		this.id = id;
		this.nome = nome;
		CNPJ = cNPJ;
		this.ie = ie;
		this.email = email;
		this.endereco = endereco;
		this.telefone = telefone;
		this.dataCadastro = dataCadastro;
	}




	@Override
	public String toString() {
		return "Clientes [id=" + id + ", nome=" + nome + ", CNPJ=" + CNPJ + ", ie=" + ie + ", email=" + email
				+ ", endereco=" + endereco + ", telefone=" + telefone + ", dataCadastro=" + dataCadastro + ", cidades="
				+ cidades + "]";
	}
	
	
	
	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCNPJ() {
		return CNPJ;
	}


	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}


	public String getIe() {
		return ie;
	}


	public void setIe(String ie) {
		this.ie = ie;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Date getDataCadastro() {
		return dataCadastro;
	}


	public void setDataCadastro(Date dataCadastro) {
		this.dataCadastro = dataCadastro;
	}


	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	
	public List<Cidades> getCidades() {
		return cidades;
	}


	public void setCidades(List<Cidades> cidades) {
		this.cidades = cidades;
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
		Clientes other = (Clientes) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	
	
	
	
	
	
}
