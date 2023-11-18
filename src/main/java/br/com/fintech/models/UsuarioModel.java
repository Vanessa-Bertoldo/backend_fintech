package br.com.fintech.models;

import java.util.Calendar;

public class UsuarioModel {
	private int id;
	private String nome;
	private String email;
	private String senha;
	private String telefone;
	private String cargo;
	private Calendar dataNascimento;
	private double salario;
	private EnderecoModel endereco;
	private boolean adm;
	
	public UsuarioModel() {
		super();
	}
	
	public UsuarioModel(int id, String nome, String email, String telefone, String cargo, Calendar dataNascimento,
			double salario, EnderecoModel endereco, boolean adm, String senha) {
		super();
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.cargo = cargo;
		this.dataNascimento = dataNascimento;
		this.salario = salario;
		this.endereco = endereco;
		this.adm = adm;
		this.senha = senha;
	}
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public Calendar getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public EnderecoModel getEndereco() {
		return endereco;
	}

	public void setEndereco(EnderecoModel endereco) {
		this.endereco = endereco;
	}

	public boolean isAdm() {
		return adm;
	}

	public void setAdm(boolean adm) {
		this.adm = adm;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	@Override
	public String toString() {
		return "UsuarioModel [nome=" + nome + ", email=" + email + ", senha=" + senha + ", telefone=" + telefone
				+ ", cargo=" + cargo + ", dataNascimento=" + dataNascimento + ", salario="
				+ salario + ", endereco=" + endereco + ", adm=" + adm + "]";
	}
	
	
}
