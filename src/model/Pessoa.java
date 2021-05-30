package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import exception.PessoaExcecao;

public class Pessoa {
	
	Scanner s = new Scanner(System.in);
	
	List<String> nomes = new ArrayList<String>();
	
	
	public void addNomes() {
		System.out.println("Informe quantos nomes que você quer adicionar a lista");
		int qnt = s.nextInt();
		for (int i = 0; i < qnt; i++) {
			String nome ="";
			System.out.println("digite o nome a ser adicionado na lista");
			nome = s.next();
			nomes.add(nome);
		}
	}
	
	public void listarNomes()  {
		if(nomes==null) {
			System.out.println("lista vazia");
		}else {
			Collections.sort(nomes);
				for(String n: nomes) {
					System.out.println(n);
				}
		}
	}
	
	public void incluirNome() {
		String novo ="";
		System.out.println("escreva o nome que voce deseja adicionar");
		novo= s.next();
		nomes.add(novo);
	}
	
	public boolean existePessoa() throws PessoaExcecao {
		System.out.println("digite o nome que deseja procurar");
		String nome = s.nextLine();
		for(String n: nomes) {
			if (n!= null && n.equals(nome)) {
				return true;
			}
		}
		return false;
	}
	
	public String procurarPessoa() {
		System.out.println("digite o nome que deseja procurar");
		String nome = s.nextLine();
		for(String n: nomes) {
			if (n!= null && n.equals(nome)) {
				return nome;
			}else {
				 nome = ("Esse nome nao existe na lista");
			}
		}
		return nome;
	}
	
	public void excluirNome() {
		System.out.println("digite o nome que deseja excluir");
		String nome = s.next();
		for(String n: nomes) {
			if (n!= null && n.equals(nome)) {
				nomes.remove(nome);
				break;
			}else {
				 System.out.println("Esse nome nao existe na lista");
			}
		}
	}
	
	public void alterarNome() {
		excluirNome();
		System.out.println("digite o nome que deseja pôr no lugar");
		String novo = s.next();
		nomes.add(novo);
			}
		
	
}
