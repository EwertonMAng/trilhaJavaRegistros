


//new ContaCorrente()
public class ContaCorrente extends Conta implements Tributavel {
		
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public void saca(double valor) throws SaldoInsuficienteException {
		double saquecomtaxa = valor + 0.2;
		super.saca(saquecomtaxa);
	}

	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		// TODO Auto-generated method stub
		return super.saldo * 0.01;
	}	
	
}
