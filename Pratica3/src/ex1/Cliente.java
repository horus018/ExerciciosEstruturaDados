package ex1;


import java.math.BigDecimal;

public class Cliente implements Comparable<Cliente>{
	private String iban;
	private String nome;
	private String sobrenome;
	private String email;
	private String genero;
	private BigDecimal saldo;
	
	public Cliente(String iban, String nome, String sobrenome, String email, String genero, BigDecimal saldo) {
		super();
		this.iban = iban;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.email = email;
		this.genero = genero;
		this.saldo = saldo;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
	    return nome +" "+ sobrenome +" (" + email + ") R$" + saldo + " (" + iban + ")";
	}

	@Override
	public int compareTo(Cliente c) {
		return this.getSaldo().compareTo(c.getSaldo());
	}
	
}
