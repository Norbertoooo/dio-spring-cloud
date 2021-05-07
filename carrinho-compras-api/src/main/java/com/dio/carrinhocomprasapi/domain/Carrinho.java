package com.dio.carrinhocomprasapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@RedisHash("carrinho")
public class Carrinho {

    @Id
    private Long id;
    private List<Item> itens;
}
