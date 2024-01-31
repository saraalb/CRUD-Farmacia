package com.generation.farmacia.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Size(max = 100)
	@NotBlank(message = "O nome é obrigatório!")
	private String nome;

	@Size(max = 255)
	@NotBlank(message = "A descrição é obrigatória!")
	private String descricao;

	@Size(max = 50)
	@NotBlank(message = "O fornecedor é obrigatório!")
	private String fornecedor;

	@Size(min = 10, max = 10)
	@NotBlank(message = "A data de fabricação é obrigatória!")
	private String dataDeFabricacao;

	@Size(min = 10, max = 10)
	@NotBlank(message = "A data de validade é obrigatória!")
	private String dataDeValidade;

	@NotNull(message = "O código de barras é obrigatório!")
	private Integer codigoDeBarras;

	@NotNull(message = "O preço é obrigatório!")
	private BigDecimal preco;

	@NotNull(message = "A quantidade é obrigatória!")
	private Integer quantidade;

	@ManyToOne
	@JsonIgnoreProperties("produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getFornecedor() {
		return fornecedor;
	}

	public void setFornecedor(String fornecedor) {
		this.fornecedor = fornecedor;
	}

	public String getDataDeFabricacao() {
		return dataDeFabricacao;
	}

	public void setDataDeFabricacao(String dataDeFabricacao) {
		this.dataDeFabricacao = dataDeFabricacao;
	}

	public String getDataDeValidade() {
		return dataDeValidade;
	}

	public void setDataDeValidade(String dataDeValidade) {
		this.dataDeValidade = dataDeValidade;
	}

	public Integer getCodigoDeBarras() {
		return codigoDeBarras;
	}

	public void setCodigoDeBarras(Integer codigoDeBarras) {
		this.codigoDeBarras = codigoDeBarras;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
