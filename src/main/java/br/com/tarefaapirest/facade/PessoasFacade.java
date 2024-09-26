package br.com.tarefaapirest.facade;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.tarefaapirest.domain.Pessoas;
import br.com.tarefaapirest.repository.PessoasRepository;

@Service
@Component
public class PessoasFacade {
	
	@Autowired
	private PessoasRepository pessoasRepository;
	
	public Pessoas createPessoas(Pessoas pessoas) {
		
		if (pessoas.getCpf().equals("222"))
			System.out.println("Veio em branco");
			
		return pessoasRepository.save(pessoas);
	}	
	
	public List<Pessoas> acharPessoas(String cpf){
		
		return pessoasRepository.findbyCpf(cpf);
		//return pessoasRepository.findById(id);
		
	}
	
	public void deletaPessoasCpf(String cpf) {
		
		pessoasRepository.deletabyCpf(cpf);
		
	}
	
	public void deletaPessoas(String id) {
		
		pessoasRepository.deleteById(id);
		
	}
	
}