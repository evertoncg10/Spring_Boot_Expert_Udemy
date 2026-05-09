package br.com.cezartech.produtosapi.repository;

import br.com.cezartech.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
