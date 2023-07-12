package ex2;

public class Passageiro implements Comparable<Passageiro> {
	private int ordemChegada, idade;
	private String nome;
	private String destino;

	public Passageiro() {

	}

	public Passageiro(int ordemChegada, String nome, int idade, String destino) {
		super();
		this.ordemChegada = ordemChegada;
		this.idade = idade;
		this.nome = nome;
		this.destino = destino;
	}

	public int getOrdemChegada() {
		return ordemChegada;
	}

	public void setOrdemChegada(int ordemChegada) {
		this.ordemChegada = ordemChegada;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}
	
	//NAO FUNCIONOU, FAZER UM METODO COMPARATOR PRA REOORDENDAR DNV POR ORDEM DE CHEGADA DEPOIS DE USAR O COMPARRETO PRA COMPARAR POR IDADE :)
	@Override
	public int compareTo(Passageiro outroPassageiro) {
	    if (this.idade >= 70 && outroPassageiro.getIdade() < 70) {
	        return -1;
	    } else if (this.idade < 70 && outroPassageiro.getIdade() >= 70) {
	        return 1;
	    } else if (this.idade <= 8 && outroPassageiro.getIdade() <= 8) {
	        return Integer.compare(this.ordemChegada, outroPassageiro.getOrdemChegada());
	    } else if (this.idade <= 8) {
	        return -1;
	    } else if (outroPassageiro.getIdade() <= 8) {
	        return 1;
	    } else {
	        return Integer.compare(this.ordemChegada, outroPassageiro.getOrdemChegada());
	    }
	}
}
