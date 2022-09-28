package provaPOO1;

public class Bola {
	String cordabola;
	double tamanhodabola;

	public Bola(String cor_da_bola, double tamanho_da_bola) {
		
		this.cordabola = cor_da_bola;
		this.tamanhodabola = tamanho_da_bola;
	}

	public Bola maiorBola(Bola escolhaabola1, Bola escolhaabola2) {
		if (escolhaabola1.tamanhodabola > escolhaabola2.tamanhodabola) {
			return escolhaabola1;
		} else {
		return escolhaabola2;
		}
	}

	public String retornarDados() {
		return cordabola + tamanhodabola;
		
		
	}
	
	

}
