package ex1;

import java.util.Collections;

public class Programa {

	public static void main(String[] args) {
		int masculino = 0;
		int feminino = 0;
		int naoBinario = 0;
		int contador = 1;

		System.out.println("Os 10 clientes mais ricos sao:");
		System.out.println("=============================");

		ManipuladorCSV manipuladorCsv = new ManipuladorCSV();
		Collections.sort(manipuladorCsv.lerArquivo(), Collections.reverseOrder());

		for (Cliente cliente : manipuladorCsv.getListaClientes()) {
			if (contador == 11) {
				break;
			}
			if (cliente.getGenero().equalsIgnoreCase("Male")) {
				masculino++;
			}else if(cliente.getGenero().equalsIgnoreCase("Female")) {
				feminino++;
			}else {
				naoBinario++;
			}
			
			System.out.println(contador+") "+cliente);
			contador++;
		}
		
		System.out.println("=============================");
		System.out.println("Clientes que se declaram com o genero masculino: "+masculino);
		System.out.println("Clientes que se declaram com o genero feminino: "+feminino);
		System.out.println("Clientes que se declaram com o genero nao binario: "+naoBinario);

	}

}
