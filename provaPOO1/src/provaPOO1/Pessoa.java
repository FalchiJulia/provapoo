package provaPOO1;

public class Pessoa {
	String nome;
	String sobrenome;
	
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
	
	public String getNomeCompleto () {
		String nome1;
		nome1 = toString().concat(nome + sobrenome);
		return nome1;
		
	}

	public Pessoa(String nome, String sobrenome) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Pessoa () {
		
	}
	



	

}
