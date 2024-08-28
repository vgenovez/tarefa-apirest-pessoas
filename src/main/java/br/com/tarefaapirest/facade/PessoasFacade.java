package br.com.tarefaapirest.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.tarefaapirest.domain.Pessoas;
import br.com.tarefaapirest.repository.PessoasRepository;

@Component
public class PessoasFacade {
	
	@Autowired
	private PessoasRepository pessoasRepository;
	
	public Pessoas createPessoas(Pessoas pessoas) {
		return pessoasRepository.save(pessoas);
	}	
}
