package br.com.fiap.financiamentos.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import java.io.Serializable;

public class Financiamento implements Serializable {
    private static final long serialVersionUID = 1L;
    private long id;
    @NotBlank
    private String nome;
    @NotBlank
    private String endereço;
    @Positive
    private int numero_casa;
    @NotBlank
    private String cidade;
    @NotBlank
    private String estado;
    @NotBlank
    private String cep;
    @NotBlank
    private String cpf;
    @NotBlank
    private String rg;
    @NotBlank
    private String data_aniversario;
    @NotBlank
    private String email;
    @NotBlank
    private String telefone;
    @NotBlank
    private String celular;
    @NotBlank
    private String tipo_financiamento;
    @Positive
    private int qtd_parcelamento;
    @Positive
    private int vlr_intencao;
    @Positive
    private int salario;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public int getNumero_casa() {
        return numero_casa;
    }

    public void setNumero_casa(int numero_casa) {
        this.numero_casa = numero_casa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getData_aniversario() {
        return data_aniversario;
    }

    public void setData_aniversario(String data_aniversario) {
        this.data_aniversario = data_aniversario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTipo_financiamento() {
        return tipo_financiamento;
    }

    public void setTipo_financiamento(String tipo_financiamento) {
        this.tipo_financiamento = tipo_financiamento;
    }

    public int getQtd_parcelamento() {
        return qtd_parcelamento;
    }

    public void setQtd_parcelamento(int qtd_parcelamento) {
        this.qtd_parcelamento = qtd_parcelamento;
    }

    public int getVlr_intencao() {
        return vlr_intencao;
    }

    public void setVlr_intencao(int vlr_intencao) {
        this.vlr_intencao = vlr_intencao;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }


}
