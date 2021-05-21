package br.com.fiap.financiamentos.service;

import br.com.fiap.financiamentos.dto.Financiamento;

import java.util.List;

public interface FinanciamentoService {
    List<Financiamento>listaFinanciamentos();

    Financiamento salvaFinanciamento(Financiamento financiamento);

    Financiamento editarFinanciamento(Long id);


}
