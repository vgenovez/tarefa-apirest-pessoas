package br.com.tarefaapirest.domain;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import jakarta.validation.constraints.NotBlank;

@Component
@Document(collection = "pessoas")
public class Pessoas {

	@Id
	private String id;
	
    @NotBlank(message = "Nome não pode estar vazio")
	private String nome;
	
    @NotBlank(message = "CPF não pode estar vazio")
	private String cpf;
    
    @NotBlank(message = "Telefone não pode estar vazio")
	private String telefone;
	
    //@NotBlank(message = "Data de Nascimento não pode estar vazio")
	private Date dataNascimento;
	
	public Pessoas() {}
	
	public Pessoas(@NotBlank(message = "CPF não pode estar vazio") String cpf) {
		this.cpf = cpf;
	}
	
	public Pessoas(String id, @NotBlank(message = "Nome não pode estar vazio") String nome,
			@NotBlank(message = "CPF não pode estar vazio") String cpf,
			@NotBlank(message = "Telefone não pode estar vazio") String telefone, Date dataNascimento) {
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}
	
	public Pessoas(@NotBlank(message = "Nome não pode estar vazio") String nome,
			@NotBlank(message = "CPF não pode estar vazio") String cpf,
			@NotBlank(message = "Telefone não pode estar vazio") String telefone, Date dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getTelefone() {
		return telefone;
	}
	
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Date getDataNascimento() {
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}