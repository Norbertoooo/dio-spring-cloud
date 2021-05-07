package com.dio.catalogoprodutoapi.repository;

import com.dio.catalogoprodutoapi.domain.Produto;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends CrudRepository<Produto, Long> {
}
