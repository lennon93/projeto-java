package aula1;

import javax.swing.JOptionPane;

public class Operadores {

	public static void main(String[] args) {
		int numero1 = 10;
		int numero2 = 10;

		String var = JOptionPane.showInputDialog("Digite o primeiro n�mero");
		numero1 = Integer.parseInt(var);
		String var2 = JOptionPane.showInputDialog("Digite o segundo n�mero");
		numero2 = Integer.parseInt(var2);
		// != diferente
		// > maior
		// < menor
		// == igual

		if (numero1 == numero2) {
			JOptionPane.showMessageDialog(null, "Os n�meros s�o iguais ");
		} else {
			JOptionPane.showMessageDialog(null, "Os n�meros n�o s�o iguais ");
		}

		String operacao = JOptionPane.showInputDialog("Digite a operacao");
		if (operacao.equals("soma")) {
			int soma = numero1 + numero2;
			JOptionPane.showMessageDialog(null, "A soma �: " + soma);
		} else if (operacao.equals("subtracao")) {
			int subtracao = numero1 - numero2;
			JOptionPane.showMessageDialog(null, "A subtra��o �: " + subtracao);
		} else if (operacao.equals("multiplicacao")) {
			int multiplicacao = numero1 * numero2;
			JOptionPane.showMessageDialog(null, "A multiplica��o �: " + multiplicacao);
		} else if (operacao.equals("divisao")) {
			int divisao = numero1 / numero2;
			JOptionPane.showMessageDialog(null, "A divis�o �: " + divisao);
		}

	}

}
