package br.com.fintech.models;

public class ContaBancariaModel {
	private int id;
	private String agencia;
	private String conta;
	private double saldo;
	private String tipoConta;
	private boolean ativo;
	private UsuarioModel id_usuario;
	
	public ContaBancariaModel() {
		super();
	}
	
	public ContaBancariaModel(int id,String agencia, String conta, double saldo, String tipoConta, boolean ativo, UsuarioModel id_usuario) {
		super();
		this.id 			= id;
		this.agencia 		= agencia;
		this.conta 			= conta;
		this.saldo 			= saldo;
		this.tipoConta 		= tipoConta;
		this.ativo 			= ativo;
		this.id_usuario 	= id_usuario;
		
	}

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getTipoConta() {
		return tipoConta;
	}

	public void setTipoConta(String tipoConta) {
		this.tipoConta = tipoConta;
	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	
	
	public UsuarioModel getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(UsuarioModel id_usuario) {
		this.id_usuario = id_usuario;
	}

	@Override
	public String toString() {
		return "ContaBancariaModel [agencia=" + agencia + ", conta=" + conta + ", saldo=" + saldo + ", tipoConta="
				+ tipoConta + ", ativo=" + ativo + "]";
	}
	
	
}
