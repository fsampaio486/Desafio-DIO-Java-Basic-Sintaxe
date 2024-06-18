package ContaBanco;

public class ContaTerminal {
	
	private int numero;
	private String agencia;
	private String nomeCliente;
	private double saldo;

	public ContaTerminal(int numero, String agencia, String nomeCliente, double saldo) {
		super();
		this.numero = numero;
		this.agencia = agencia;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
	}
	
	public ContaTerminal() {
	    }
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return "Olá " +
			   getNomeCliente().toUpperCase() +
		       ", obrigado por criar uma conta em nosso banco, sua agência é " +
		       String.format("%s-%s", agencia.substring(0, 3), agencia.substring(3)) +
		       ", conta " +
		       getNumero() +
		       " e seu saldo " +
		       String.format("%.2f", getSaldo()) + 
		       " já está disponível para saque.";    
	}
	
}
