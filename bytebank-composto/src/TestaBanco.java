
public class TestaBanco {

	public static void main(String[] args) {
		Cliente ana = new Cliente();
		ana.nome = "Ana Luiza";
		ana.cpf = "222.222.222-22";
		ana.profissao = "analista de qualidade";
		
		Conta contaDaAna = new Conta();
		contaDaAna.deposita(100);
		
		// assicua o cliente ana a conta contaDaAna
		contaDaAna.titular = ana; //ana é um cliente -> criado acima	
		System.out.println(contaDaAna.titular.nome);
		
	}
}
