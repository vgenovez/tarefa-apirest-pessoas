package br.com.tarefaapirest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.tarefaapirest.domain.Pessoas;

public interface PessoasRepository extends MongoRepository<Pessoas, String> {

}
