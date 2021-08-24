package controller;

public class ContagemController {
	public ContagemController() {
		super();
	}
	
	public int contagem(int n, int repeticoes) {
		
		//Condição de parada
		if (n == 0) {
			return 0;
		} else {
			// inicializa contador das repetições
			int contador = 0;
			//divide o numero recebido por 10
			int div = n / 10;
			// pega o resto da divisao do numero recebido por 10 e compara com o numero que vai se repetir
			if (n % 10 == repeticoes) {
				contador = 1;
			}
			// retorna o contador + o resultado da divisão e o numero de repetições
			//relação = soma contador com a função
			return contador + contagem(div, repeticoes);
		}
	}
}

