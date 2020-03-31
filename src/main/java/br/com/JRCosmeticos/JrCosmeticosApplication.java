package br.com.JRCosmeticos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.JRCosmeticos.domain.Cliente;
import br.com.JRCosmeticos.domain.Produto;
import br.com.JRCosmeticos.repository.ProdutoRepository;

@SpringBootApplication
public class JrCosmeticosApplication implements CommandLineRunner {

	
	@Autowired
	private ProdutoRepository repo;
	
	public static void main(String[] args) {
		SpringApplication.run(JrCosmeticosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Produto p1 = new Produto(null, "Perfume", "Essencial - Maria", 120.00);
		Produto p2 = new Produto(null, "Batom", "Fera - Maria", 20.00);
		Produto p3 = new Produto(null, "Sahampo", "TOp - Maria", 100.00);
		Produto p4 = new Produto(null, "Condicionador", "Top - Maria", 80.00);
		
		repo.saveAll(Arrays.asList(p1,p2,p3,p4));
		
		Cliente jeane = new Cliente(null, "Jeane de JEsus", "6199116-7672", "Rua sem nome");
		
//		Venda vendaJeane = new Venda(null, "Venda Jeane", , jeane);
	}

}
