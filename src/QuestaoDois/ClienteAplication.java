package QuestaoDois;


import java.util.Scanner;

public class ClienteAplication {

	public static void main(String[] args) {
		boolean playProgran = true;

		int id, idade;
		String nome, telefone;


		System.out.println("--------------Cadastro de cliente--------------");

		System.out.println();
		System.out.println();

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Caso queira encerrar o programa Digite (-1) ou qualquer outro numero negativo! ");
		do {
			System.out.println("ID do cliente: ");
			id = entrada.nextInt();
			if (id < 0) {
				playProgran = false;
				System.out.println("Voce digitou um numero negativo, e esta encerrando o programa!");
			} else {
				
				nome = entrada.nextLine();
				System.out.println("Informe o Nome do cliente: ");
				entrada.nextLine();

				System.out.println("Informe a idade do cliente: ");
				idade = entrada.nextInt();

				System.out.println("Informe o telefone do cliente: ");
				telefone = entrada.next();
				
				System.out.println("Cliente cadastrado!");

				new Cliente(id, nome, idade, telefone);
			}

		} while (playProgran);

		System.out.println("CLIENTES CADASTRADOS");
		System.out.println("---------------------");
		Cliente.mostraClinCadastrado();
		
		entrada.close();
	

	}

}
