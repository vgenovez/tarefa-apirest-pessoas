package br.com.tarefaapirest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarefaapirest.domain.Pessoas;
import br.com.tarefaapirest.facade.PessoasFacade;
import jakarta.validation.Valid;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pessoas")
public class TarefaApiRestController {
	
	@Autowired
	private PessoasFacade pessoasFacade;
	
	@PostMapping
	public ResponseEntity<Pessoas> addPessoas(@Valid @RequestBody Pessoas pessoas){
		
		return new ResponseEntity<>(pessoasFacade.createPessoas(pessoas), HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/{cpf}", headers = "version=v1")
	public ResponseEntity<Pessoas> consultaPessoas (@PathVariable(name = "cpf") String cpf){
		List<Pessoas> pessoasList = pessoasFacade.acharPessoas(cpf);
		
		if (pessoasList.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		return new ResponseEntity<>(pessoasList.get(0), HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/{id}", headers="version=v1")
	public ResponseEntity<String> deletaPessoas(@PathVariable(name = "id") String id){

		//pessoasFacade.deletaPessoas(cpf);
		pessoasFacade.deletaPessoas(id);
		
		return new ResponseEntity<>("Retorno OK",HttpStatus.OK);
	}
	
	@DeleteMapping(value = "deletacpf/{cpf}", headers="version=v1")
	public ResponseEntity<String> deletaPessoasCpf(@PathVariable String cpf){

		pessoasFacade.deletaPessoasCpf(cpf);
		
		return new ResponseEntity<>("Retorno OK",HttpStatus.OK);
	}

}
