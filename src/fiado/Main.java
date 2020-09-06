package fiado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Consumidor consumidor = new Consumidor();
		consumidor.fiados = new int[10];
		
		int cont = 0;
		int repet = 0;
		
		
		Scanner scanner = new Scanner(System.in);
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Informe o nome do cliente: ");
		consumidor.nome = scanner.nextLine();
		System.out.printf("Informe o número de valores que deseja adicionar: ");
		repet = ler.nextInt();		
		
		while (cont < repet) {
			System.out.print("Informe o valor da compra: ");
			consumidor.fiados[cont] = Integer.valueOf(scanner.nextLine());
			if (consumidor.fiados[cont] > 0) {
				cont++;
			}
			else {
				System.out.print("Informe um valor maior que zero! ");
				return;
			}
		}
		
		int total = somaWhile(consumidor.fiados);
		
		if (total > 100) {
			System.out.println("Cliente " + consumidor.nome + " deve " + total + " - ganhou brinde!");
		}
		else {
			System.out.println("Cliente " + consumidor.nome + " deve " + total);
		}
	}
	
	public static int somaWhile(int[] fiados) {
		int cont = 0;
		int total = 0;
		while (cont < fiados.length) {
			total += fiados[cont];
			cont++;
		}
		return total;
	}
	
	public static int somaFor(int[] fiados) {
		int total =0;
		
		for(int cont = 0; cont < fiados.length; cont++) {
			total += fiados[cont];
		}
		return total;
	}
	
	public static int somaForeach(int[] fiados) {
		int total =0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}

}
