package br.com.fintech.models;

import java.util.Calendar;

public class DespesaModel{
	private int id;
	private String tipo;
	private double valor;
	private Calendar dataCriacao;
	private String descricao;
	private int usuarioID;
	
	public DespesaModel() {
		super();
	}
	
	public DespesaModel(int id, String tipo, double valor, Calendar dataCriacao, String descricao, int usuarioID) {
		super();
		this.id 			= id;
		this.tipo 			= tipo;
		this.valor 			= valor;
		this.dataCriacao 	= dataCriacao;
		this.descricao		= descricao;
		this.usuarioID 		= usuarioID;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public int getUsuarioID() {
		return usuarioID;
	}

	public void setUsuarioID(int usuarioID) {
		this.usuarioID = usuarioID;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "DespesaModel [id=" + id + ", tipo=" + tipo + ", valor=" + valor + ", dataCriacao=" + dataCriacao
				+ ", descricao=" + descricao + ", usuarioID=" + usuarioID + "]";
	}
	
	
	
}
