package modelo;


import java.util.ArrayList;
import java.util.List;

public class Empresa {
	private String nome;
	private String cnpj;
	private List<Funcionario> funcionarios;

	public Empresa(String nome, String cnpj) {
		this.nome = nome;		
		this.cnpj = cnpj;
		this.funcionarios = new ArrayList<Funcionario>();
	}


	public String getCnpj() {
		return this.cnpj;
	}


	public String getNome() {

		return this.nome;
	}


	public void adicionaFuncionario(Funcionario pFuncionario) {

		this.funcionarios.add(pFuncionario);

	}

	public List<Funcionario> getFuncionarios(){
		return funcionarios;
	}




}