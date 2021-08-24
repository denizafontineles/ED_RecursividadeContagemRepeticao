package view;
import controller.ContagemController;

public class Principal {

	public static void main(String[] args) {
		ContagemController op = new ContagemController();
		int n = 1113871230;
		int repeticoes = 1;
		
		int contagem = op.contagem(n, repeticoes);
		System.out.println("Repetição " + repeticoes + " do número " + n + " são " + contagem);
	}
}
