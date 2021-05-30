package ui;

import java.util.Scanner;

import model.Pessoa;

public class Principal {
		
	public static void main(String[] args) {
		Pessoa p = new Pessoa();
		Scanner s = new Scanner(System.in);
		int i;
		do {
			System.out.println("Escolha uma das opcoes\n1 Cadastrar Nomes\n2 Listar Nomes\n3 Incluir Nome\n4 Excluir Nome\n5 Alterar Nome\n6 Sair ");
			 i = s.nextInt();
		switch(i) {
		case 1:
			p.addNomes();
			break;
		case 2:
			p.listarNomes();
			break;
		case 3:
			p.incluirNome();
			break;
		case 4:
			p.excluirNome();
			break;
		case 5:
			p.alterarNome();;
			break;
		case 6:
			i=6;
			break;
		default:
			System.out.println("Opcao invalida");
			break;
		}
	}while(i!=6);
		s.close();
	}
}
