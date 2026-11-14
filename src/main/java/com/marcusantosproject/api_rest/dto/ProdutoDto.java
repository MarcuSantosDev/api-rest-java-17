package com.marcusantosproject.api_rest.dto;

import com.marcusantosproject.api_rest.database.model.ProdutoEntity;
import lombok.*;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class ProdutoDto {
    private String nome;
    private BigDecimal preco;
    private Integer quantidade;

    public ProdutoDto(ProdutoEntity produtoEntity){
        this.nome = produtoEntity.getNome();
        this.preco = produtoEntity.getPreco();
        this.quantidade = produtoEntity.getQuantidade();

    }
}

