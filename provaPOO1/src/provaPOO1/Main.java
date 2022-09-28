package provaPOO1;

public class Main {

	public static void main(String[] args) {
		Conta[] listarcontas = new Conta[10];

		for(int i=0; i<listarcontas.length; i++) {
			Conta conta_nova;
			if(i % 2 == 0) {
				conta_nova = new ContaPoupanca(1500, 0.1);
			} else {
				conta_nova = new ContaCorrente(1500, 0.05);
			}
			listarcontas[i] = conta_nova;
		}
		
		for(int i=0; i<listarcontas.length; i++) {
			Conta conta = listarcontas[i];
			if( listarcontas[i] instanceof ContaPoupanca) {
				ContaPoupanca conta_poupanca = (ContaPoupanca) conta;
				System.out.println("Rendimento:" + conta_poupanca.CalculaRendimento());
			} else {
				ContaCorrente conta_corrente = (ContaCorrente) conta;
				System.out.println(conta_corrente.saldo);				
			}
		}
		
	}

}
