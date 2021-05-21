package br.com.fiap.financiamentos.service.impl;

import br.com.fiap.financiamentos.dto.Financiamento;
import br.com.fiap.financiamentos.entity.FinanciamentoEntity;
import br.com.fiap.financiamentos.repository.FinanciamentoRepository;
import br.com.fiap.financiamentos.service.FinanciamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class FinanciamentoServiceImpl implements FinanciamentoService {

    @Autowired
    FinanciamentoRepository repository;

    @Override
    public List<Financiamento> listaFinanciamentos() {
        List<FinanciamentoEntity> lista = repository.findAll();
        List<Financiamento> financiamentos = fromTo(lista);
        return financiamentos;
    }

    @Override
    public Financiamento salvaFinanciamento(Financiamento financiamento) {
        FinanciamentoEntity entity = fromTo(financiamento);
        entity = repository.save(entity);
        Financiamento financiamentoRetorno = fromTo(entity);
        return financiamentoRetorno;
    }

    @Override
    public Financiamento editarFinanciamento(Long id) {
        FinanciamentoEntity entity = repository.findById(id).get();
        return fromTo(entity);
    }

    private FinanciamentoEntity fromTo(Financiamento financiamento){
        FinanciamentoEntity entity =  new FinanciamentoEntity();
        entity.setId(financiamento.getId());
        entity.setNome(financiamento.getNome());
        entity.setEndereço(financiamento.getEndereço());
        entity.setNumero_casa(financiamento.getNumero_casa());
        entity.setCidade(financiamento.getCidade());
        entity.setEstado(financiamento.getEstado());
        entity.setCep(financiamento.getCep());
        entity.setCpf(financiamento.getCpf());
        entity.setRg(financiamento.getRg());
        entity.setData_aniversario(financiamento.getData_aniversario());
        entity.setEmail(financiamento.getEmail());
        entity.setTelefone(financiamento.getTelefone());
        entity.setEmail(financiamento.getEmail());
        entity.setCelular(financiamento.getCelular());
        entity.setTipo_financiamento(financiamento.getTipo_financiamento());
        entity.setQtd_parcelamento(financiamento.getQtd_parcelamento());
        entity.setVlr_intencao(financiamento.getVlr_intencao());
        entity.setSalario(financiamento.getSalario());
        return entity;
    }

    private List<Financiamento> fromTo(List<FinanciamentoEntity> lista){
        List<Financiamento> listaDto = new ArrayList<>();
        for (FinanciamentoEntity financiamentoEntity : lista) {
            Financiamento dto = new Financiamento();
            dto.setId(financiamentoEntity.getId());
            dto.setNome(financiamentoEntity.getNome());
            dto.setEndereço(financiamentoEntity.getEndereço());
            dto.setNumero_casa(financiamentoEntity.getNumero_casa());
            dto.setCidade(financiamentoEntity.getCidade());
            dto.setEstado(financiamentoEntity.getEstado());
            dto.setCep(financiamentoEntity.getCep());
            dto.setCpf(financiamentoEntity.getCpf());
            dto.setRg(financiamentoEntity.getRg());
            dto.setData_aniversario(financiamentoEntity.getData_aniversario());
            dto.setEmail(financiamentoEntity.getEmail());
            dto.setTelefone(financiamentoEntity.getTelefone());
            dto.setEmail(financiamentoEntity.getEmail());
            dto.setCelular(financiamentoEntity.getCelular());
            dto.setTipo_financiamento(financiamentoEntity.getTipo_financiamento());
            dto.setQtd_parcelamento(financiamentoEntity.getQtd_parcelamento());
            dto.setVlr_intencao(financiamentoEntity.getVlr_intencao());
            dto.setSalario(financiamentoEntity.getSalario());
            listaDto.add(dto);
        }
        return listaDto;
    }

    private Financiamento fromTo(FinanciamentoEntity entity){
        Financiamento financiamento =  new Financiamento();
        financiamento.setId(entity.getId());
        financiamento.setNome(entity.getNome());
        financiamento.setEndereço(entity.getEndereço());
        financiamento.setNumero_casa(entity.getNumero_casa());
        financiamento.setCidade(entity.getCidade());
        financiamento.setEstado(entity.getEstado());
        financiamento.setCep(entity.getCep());
        financiamento.setCpf(entity.getCpf());
        financiamento.setRg(entity.getRg());
        financiamento.setData_aniversario(entity.getData_aniversario());
        financiamento.setEmail(entity.getEmail());
        financiamento.setTelefone(entity.getTelefone());
        financiamento.setEmail(entity.getEmail());
        financiamento.setCelular(entity.getCelular());
        financiamento.setTipo_financiamento(entity.getTipo_financiamento());
        financiamento.setQtd_parcelamento(entity.getQtd_parcelamento());
        financiamento.setVlr_intencao(entity.getVlr_intencao());
        financiamento.setSalario(entity.getSalario());
        return financiamento;
    }


}
