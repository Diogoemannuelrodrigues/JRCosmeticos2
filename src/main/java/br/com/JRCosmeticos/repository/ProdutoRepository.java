package br.com.JRCosmeticos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.JRCosmeticos.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer>{

}
