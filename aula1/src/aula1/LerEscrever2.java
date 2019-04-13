package aula1;

import javax.swing.JOptionPane;

public class LerEscrever2 {

	public static void main(String[] args) {
		String var1;
		var1 = JOptionPane.showInputDialog("Digite o seu nome:");
		
		JOptionPane.showMessageDialog(null, "O seu nome é: "+var1);

	}

}
