package provaPOO1;

public class ContaCorrente extends Conta {
	double taxa;

	public ContaCorrente(double saldo, double taxa) {
		super(saldo);
		this.taxa = taxa;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	public double taxa() {
		double aux;
		aux = saldo - this.getTaxa(); 
		return aux;
	}
	
	
	

}
