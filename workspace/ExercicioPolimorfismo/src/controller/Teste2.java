package controller;

import util.Teclado;
import model.Endereco;
import model.Funcionario;
import model.Gerente;
import model.Pessoa;

public class Teste2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pessoa pessoas[] = new Pessoa[1];
		
		for (int i = 0; i < pessoas.length; i++) {
			int opcao=0;
			boolean ok;
			do{
				ok=true;
				String nome = null;
				String nasc = null;
				int avaliacao = 0;
				double salario = 0;

				String logradouro = null;
				String numero = null;
				String complemento = null;
				String bairro = null;
				String cidade = null;
				String estado = null;
				String cep = null;

				Endereco endereco = null;

				opcao=Teclado.lerInt("Digite a opção desejada:\n1-Pessoa\n2-Funcionário\n3-Gerente");
				if(opcao>=1 && opcao<=3){
					nome=Teclado.lerTexto("Nome:");
					nasc=Teclado.lerTexto("Nascimento:");
					avaliacao=Teclado.lerInt("Avaliação:");
					salario=Teclado.lerDouble("Salário:");

					logradouro=Teclado.lerTexto("Logradouro:");
					numero=Teclado.lerTexto("Número:");
					complemento=Teclado.lerTexto("Complemento:");
					bairro=Teclado.lerTexto("Bairro:");
					cidade=Teclado.lerTexto("Cidade:");
					estado=Teclado.lerTexto("Estado:");
					cep=Teclado.lerTexto("CEP:");

					endereco=new Endereco(logradouro, numero, complemento, bairro, cidade, estado, cep);

				}
				
				switch (opcao) {
				case 1:
					pessoas[i]=new Pessoa(nome, nasc, avaliacao, salario, endereco);
					break;
				case 2:
					String setor=Teclado.lerTexto("Setor:");
					pessoas[i]=new Funcionario(nome, nasc, avaliacao, salario, endereco, setor);
					break;
				case 3:
					String projeto=Teclado.lerTexto("Projeto:");
					pessoas[i]=new Gerente(nome, nasc, avaliacao, salario, endereco, projeto);
					break;
				default:
					System.out.println("Opção inválida.");
					ok=false;
					break;
				}
			}while(!ok);
		}
		
		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i].mostrar();
			System.out.println("Salário calculado: "+pessoas[i].calculaSal());
		}
	}
}
