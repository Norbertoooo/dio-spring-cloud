package com.dio.catalogoprodutoapi.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(indexName = "produto")
public class Produto {

    @Id
    private Long id;
    private String nome;
    private Integer preco;
}
