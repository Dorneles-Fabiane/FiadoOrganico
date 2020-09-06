package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int cont = 0, repet = 0;
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Informe o nome do cliente: ");
		
		String nome = scanner.nextLine();
		Consumidor consumidor = new Consumidor(nome);
		
		System.out.print("Informe o telefone do cliente: ");
		
		String telefone = scanner.nextLine();
		consumidor.setTelefone(telefone);
		
		Scanner ler = new Scanner(System.in);		
		System.out.printf("Informe o número de valores que deseja adicionar: ");
		repet = ler.nextInt();		
		
		while (cont < repet) {
			System.out.print("Informe o valor da compra: ");
			int fiado = Integer.valueOf(scanner.nextLine());
			consumidor.registrarFiado(fiado);
			if (consumidor.getFiado() > 0) {
				cont++;
			}
			else {
				System.out.print("[ERRO] Informe um valor maior que zero! ");
				return;
			}
		}
		
		int total = consumidor.getFiado();
		
		if (total > 100) {
			System.out.println("Cliente " + consumidor.getNome() + " - Telefone: " + consumidor.getTelefone() +  " deve R$ " + total + ".");
		}
		else {
			System.out.println("Valor inferior a R$ 100,00...");
		}
	}
}
