
public class Main {

	public static void main(String[] args) {
		Cliente luciano = new Cliente();
		luciano.setNome("Luciano");
		
		Conta cc = new ContaCorrente(luciano);
					
		Conta poupanca = new ContaPoupanca(luciano);
		
		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		

	}

}