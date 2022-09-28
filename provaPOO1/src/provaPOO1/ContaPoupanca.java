package provaPOO1;

public class ContaPoupanca extends Conta {
	double rendimento;

	public ContaPoupanca(double saldo, double rendimento) {
		super(saldo);
		this.rendimento = rendimento;
	}

	public double getRendimento() {
		return rendimento;
	}

	public void setRendimento(double rendimento) {
		this.rendimento = rendimento;
	}
	public double CalculaRendimento() {
		double rendimento1;
		rendimento1 = saldo * rendimento;
		return rendimento1; }
	
	
	

	


}
