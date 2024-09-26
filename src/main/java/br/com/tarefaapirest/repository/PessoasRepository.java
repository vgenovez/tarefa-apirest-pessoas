package br.com.tarefaapirest.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import br.com.tarefaapirest.domain.Pessoas;

public interface PessoasRepository extends MongoRepository<Pessoas, String> {

	//Busca por CPF
	@Query(" {'cpf' :  ?0} ")
	public List<Pessoas> findbyCpf(String cpf);
	
	//Deleta por CPF
	@Query("{'cpf' :  ?0}")
	public void deletabyCpf(String cpf);
}
