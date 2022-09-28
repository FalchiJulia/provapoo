package provaPOO1;
import javax.swing.JOptionPane;

public class Conta {
	
	double saldo;
	
	
	public Conta(double saldo) {
		if (saldo > 0) {
			this.saldo = saldo;
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
	
	

	public double getSaldo() {
		return saldo;
	}


	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public double SaldoSacar() {
		double saque = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser sacado: "));
		saldo = saldo - saque;
		return saldo;
	}
	public double SaldoDepositar() {
		double deposito = Double.parseDouble(JOptionPane.showInputDialog("Valor a ser depositado: "));
		saldo = saldo + deposito;
		return saldo;
	}

	
	




}
