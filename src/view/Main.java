package view;
import modelo.Empresa;
import modelo.Funcionario;

public class Main {

	public static void main(String[] args) {

		Empresa marketing = new Empresa("Marketing","451.658.0001/56");

		Funcionario lucas = new Funcionario("Lucas de Azevedo",2.500,"895.635.20-05");
		marketing.adicionaFuncionario(lucas);
		System.out.println(lucas.getNome());
		System.out.println(lucas.getSalario());
		System.out.println(lucas.getCpf());


		Funcionario cristopher = new Funcionario("Cristopher Silva",4.800,"741.344.94-02");
		marketing.adicionaFuncionario(cristopher);
		System.out.println(cristopher.getNome());
		System.out.println(cristopher.getSalario());
		System.out.println(cristopher.getCpf());






	}
}
