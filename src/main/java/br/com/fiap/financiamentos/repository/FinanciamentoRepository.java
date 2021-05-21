package br.com.fiap.financiamentos.repository;

import br.com.fiap.financiamentos.entity.FinanciamentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FinanciamentoRepository extends JpaRepository<FinanciamentoEntity,Long> {
}
