package com.dio.carrinhocomprasapi.web.rest;

import com.dio.carrinhocomprasapi.domain.Carrinho;
import com.dio.carrinhocomprasapi.domain.Item;
import com.dio.carrinhocomprasapi.repository.CarrinhoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carrinho")
@RequiredArgsConstructor
public class CarrinhoResource {

    private final CarrinhoRepository carrinhoRepository;

    @PostMapping("/{id}")
    public ResponseEntity<Carrinho> adicionarItens(@PathVariable Long id,@RequestBody Item item) {
        Carrinho carrinho = carrinhoRepository.findById(id).orElseThrow();
        carrinho.getItens().add(item);
        carrinhoRepository.save(carrinho);
        return ResponseEntity.ok().body(carrinho);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Carrinho> buscarCarrinho(@PathVariable Long id) {
        Carrinho carrinho = carrinhoRepository.findById(id).orElseThrow();
        return ResponseEntity.ok().body(carrinho);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluirCarrinho(@PathVariable Long id) {
        Carrinho carrinho = carrinhoRepository.findById(id).orElseThrow();
        carrinhoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
