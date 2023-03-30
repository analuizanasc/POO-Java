
public class Main {

	public static void main(String[] args) {
		//Pessoa p1 = new Pessoa();
		Aluno a1 = new Aluno();
		Professor p3 = new Professor();
		Funcionario p4 = new Funcionario();
		Visitante p5 = new Visitante();
		Bolsista b1 = new Bolsista();
		
		//p1.setNome("Pedro");
		a1.setNome("Maria");
		p3.setNome("Cláudio");
		p4.setNome("Fabiana");
		b1.setNome("Ana");
		
		//p1.setSexo("M");
		a1.setSexo("F");
		p3.setSexo("M");
		p4.setSexo("F");
		
		//System.out.println(p1.toString());
		System.out.println(a1.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		a1.setCurso("Informática");
		p3.setSalario(2500.00);
		p4.setSetor("Estoque");
		
		a1.setMatricula(1111);

		a1.pagarMensalidade();
		b1.pagarMensalidade();
		
		//p2.receberAum(550);
		//p3.mudarTrabalho();
		

		
	}
}
 