package com.dio.carrinhocomprasapi.repository;

import com.dio.carrinhocomprasapi.domain.Carrinho;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends CrudRepository<Carrinho, Long> {
}
