package br.com.tarefaapirest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.tarefaapirest.domain.Pessoas;

@SpringBootApplication
public class TarefaApirestApplication {

	public static void main(String[] args) {
		//Teste de inicio do codigo
		SpringApplication.run(TarefaApirestApplication.class, args);
		System.out.println("Hello World");
		
		Pessoas pessoas = new Pessoas();
		Pessoas pessoas2 = new Pessoas();

		pessoas.setNome("Carlos");
		System.out.println(pessoas.getNome());
		
		pessoas2.setNome("Vitor");
		System.out.println(pessoas2.getNome());
		
	}
}
