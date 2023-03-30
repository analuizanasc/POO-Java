
public class TestaGetESet {
	
	public static void main (String[] args) {
		Conta conta = new Conta();
		//conta.numeto = 1337;
		conta.setNumero(1337);
		System.out.println(conta.getNumero());
		
		Cliente paulo = new Cliente();
		//conta.titular = paulo; não compila porque titular é privado 
		//privado > não pode atribuir valores fora da classe
		
		paulo.setNome("paulo silveira");
		conta.setTitular(paulo);
		
		System.out.println(conta.getTitular().getNome());
		
		conta.getTitular().setProfissao("programador");
		
		//Em duas linhas:
		Cliente titularDaConta = conta.getTitular();
		titularDaConta.setProfissao("programador");
		
		
		
	}

}
