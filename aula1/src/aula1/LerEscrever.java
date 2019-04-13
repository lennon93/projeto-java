package aula1;

import java.util.Scanner;

public class LerEscrever {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o seu nome:");
		
		String var1 = scan.nextLine();
		
		System.out.println("O seu nome é:"+var1);
		
	}

}
