package br.com.tarefaapirest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.tarefaapirest.domain.Pessoas;
import br.com.tarefaapirest.facade.PessoasFacade;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/pessoas")
public class TarefaApiRestController {
	
	@Autowired
	private PessoasFacade pessoasFacade;
	
	public ResponseEntity<Pessoas> addPessoas(@Validated @RequestBody Pessoas pessoas){
		
		return new ResponseEntity<>(pessoasFacade.createPessoas(pessoas), HttpStatus.OK);
		
	}

}
