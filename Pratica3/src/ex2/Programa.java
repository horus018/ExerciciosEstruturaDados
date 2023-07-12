package ex2;

import java.util.Collections;

public class Programa {

	public static void main(String[] args) {
		ManipuladorCSV manipuladorCsv = new ManipuladorCSV();
		manipuladorCsv.lerArquivo();
		Collections.sort(manipuladorCsv.getListaPassageiros());
		int contador = 1;

		for (Passageiro passageiro : manipuladorCsv.getListaPassageiros()) {
			if (contador == 56) {
				break;
			} else {
				System.out.println("(" + contador + ") " + passageiro.getNome() + " de "
						+ passageiro.getIdade() + " anos, " + "com destino a " + passageiro.getDestino() + " - "
						+ "ordem de chegada: " + passageiro.getOrdemChegada());
				contador++;
			}

		}

	}

}
