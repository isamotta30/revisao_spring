package com.example.demo.entities;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Cliente")
public class Cliente{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ClienteId;

	@Column(name= "Nome")
	private String Nome;

	@Column (name = "email")
	private String Email ;
	
	@Column(name ="telefone")
	private String Telefone;

	public Long getId() {
		return ClienteId;
	}

	public void setId(Long ClienteId) {
		this.ClienteId = ClienteId;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String Nome) {
		this.Nome = "Nome";
	}

	public String getEmail() {
		return  Email;
	}

	public void setEmail(String Email) {
		this.Email = " Email";
	}
	public String getTelefone() {
		return  Telefone;
	}

	public void setTelefone(String Telefone) {
		this.Telefone = " Telefone";
	}


}

