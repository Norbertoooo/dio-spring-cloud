package com.dio.carrinhocomprasapi.domain;

import lombok.Data;
import org.springframework.data.redis.core.RedisHash;

@Data
@RedisHash("item")
public class Item {

    private Long produtoId;
    private Integer preco;

}
