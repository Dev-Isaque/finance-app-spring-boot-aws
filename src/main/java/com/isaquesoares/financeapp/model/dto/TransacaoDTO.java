package com.isaquesoares.financeapp.model.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.isaquesoares.financeapp.enums.FormaPagamento;
import com.isaquesoares.financeapp.enums.TipoTransacao;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransacaoDTO {
    private TipoTransacao tipo;
    private BigDecimal valor;
    private LocalDate data;
    private String categoria;
    private String descricao;
    private FormaPagamento formaPagamento;
    private Long userId; // ID do usuário que será vinculado à transação
}
